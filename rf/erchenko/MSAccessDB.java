package rf.erchenko;

import java.sql.*;
import java.util.*;

/**
 * Created by 1 on 09.10.2016.
 */
class MSAccessDB {
    String db;
    Connection con;
    Statement st;
    ResultSet rs;
    ArrayList<HotelRoom> hotelRoomList;

    public MSAccessDB() {
        try {
            String path = new java.io.File("./mdb/hotel.accdb").getAbsolutePath();
            db = "jdbc:ucanaccess://" + path;
            doConnection();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    private void doConnection() {
        try {
            con= DriverManager.getConnection(db);
            st = con.createStatement();
        } catch (SQLException ex) { ex.printStackTrace(); }
    }

    ResultSet executeQuery(String query) {
        try {
            return st.executeQuery(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    int executeUpdate(String query) {
        try {
            return st.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    boolean execute(String query) {
        try {
            return st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    IdentificationDocument getIdentificationDocument() {
        try {
            IdentificationDocument identificationDocument = new IdentificationDocument(rs.getString("Документ"), rs.getString("Серия"), rs.getString("Номер"), rs.getString("Кем выдан"), rs.getDate("Когда выдан"));
            //System.out.println(identificationDocument);
            return identificationDocument;
        } catch (SQLException ex) { ex.printStackTrace(); return null; }
    }

    Person getPerson() {
        try {
            Person p = new Person(rs.getString("Имя"), rs.getString("Отчество"), rs.getString("Фамилия"), getIdentificationDocument(), rs.getDate("Дата рождения"), rs.getString("Адрес проживания"));
            //System.out.println(p);
            return p;
        } catch (SQLException ex) { ex.printStackTrace(); return null; }
    }

    public void setList(ArrayList<HotelRoom> list) {
        this.hotelRoomList = list;
    }

    HotelRoom getHotelRoom() {
        try {
            for (HotelRoom hotelRoom : hotelRoomList ) {
                if (hotelRoom.getCounter()==rs.getShort("Гостиничный номер")) {
                    return hotelRoom;
                }
            }
            return null;
        } catch (SQLException ex) { ex.printStackTrace(); return null; }
    }

    ArrayList<HotelRoom> loadHotelRoomList() {
        ArrayList<HotelRoom> arrayList = new ArrayList<HotelRoom>();
        try {
            while (rs.next()) {
                HotelRoom hotelRoom = new HotelRoom(rs.getShort("Гостиничный номер"),rs.getString("Наименование"),false,rs.getByte("Количество мест"),rs.getFloat("Базовая стоимость"),
                        rs.getString("Перечень"),rs.getString("1-спальный набор постельных принадлежностей"),rs.getString("2-спальный набор постельных принадлежностей"),
                        rs.getString("2-спальный \"семейный\" набор  постельных принадлежностей"),rs.getByte("Односпальная кровать"),rs.getByte("Двуспальная кровать"),
                        rs.getByte("Диван"),rs.getByte("Кресло-кровать"),rs.getByte("Стол письменный"),rs.getByte("Стол журнальный"),rs.getByte("Тумба прикроватная"),
                        rs.getByte("Шкаф-прихожая"),rs.getByte("Стулья"),rs.getByte("Корзина для мусора"),rs.getByte("Люстра"),rs.getByte("Бра"),rs.getByte("Настольная лампа"),
                        rs.getByte("Набор полотенец(банное-1,лицевое-1,для ног-1)"),rs.getByte("Зеркало"),rs.getByte("Графин"),rs.getByte("Стаканы"),rs.getByte("Антенна комнатная"),
                        rs.getByte("Телевизор с пультом"),rs.getByte("Тюнер с пультом"),rs.getByte("Картина"),rs.getByte("Вешалка напольная"),rs.getByte("Вешалка настенная"),
                        rs.getByte("Тумба под телевизор"));
                //System.out.println(hotelRoom);
                arrayList.add(hotelRoom);
            }
            return arrayList;
        } catch (SQLException ex) { ex.printStackTrace(); return null; }
    }

    ArrayList<Booking> loadBookingList() {
        ArrayList<Booking> arrayList = new ArrayList<Booking>();
        try {
            while (rs.next()) {
                Booking booking = new Booking(rs.getDate("Дата документа"), rs.getFloat("Цена суточного пребывания"), getPerson(), getHotelRoom(), rs.getByte("Количество мест"), rs.getByte("Количество суток"), rs.getDate("Дата заезда"), rs.getDate("Дата выезда"));
                //System.out.println(booking);
                arrayList.add(booking);
            }
            return arrayList;
        } catch (SQLException ex) { ex.printStackTrace(); return null; }
    }

    ArrayList<Contract> loadContractList() {
        ArrayList<Contract> arrayList = new ArrayList<Contract>();
        try {
            while (rs.next()) {
                Contract contract = new Contract(rs.getDate("Дата документа"),rs.getFloat("Цена суточного пребывания"),getPerson(),getHotelRoom(),rs.getByte("Количество мест"),rs.getByte("Количество суток"),rs.getDate("Дата заезда"),rs.getDate("Дата выезда"),rs.getInt("Номер договора"),rs.getString("Год договора"),rs.getInt("Номер счета и приходника"),rs.getString("Серия счёта"),rs.getString("Серия приходника"),null);
                //System.out.println(contract);
                arrayList.add(contract);
            }
            return arrayList;
        } catch (SQLException ex) { ex.printStackTrace(); return null; }
    }

    ArrayList<Contract> loadAdditionalAgreementList(ArrayList<Contract> arrayList) {
        try {
            while (rs.next()) {
                AdditionalAgreement additionalAgreement = new AdditionalAgreement(rs.getDate("Дата документа"),rs.getFloat("Цена суточного пребывания"),getPerson(),getHotelRoom(),rs.getByte("Количество мест"),rs.getByte("Количество суток"),rs.getDate("Дата заезда"),rs.getDate("Дата выезда"),rs.getInt("Номер договора"),rs.getString("Год договора"),rs.getInt("Номер допсоглашения"),rs.getInt("Номер счета и приходника"),rs.getString("Серия счёта"),rs.getString("Серия приходника"));
                //System.out.println(additionalAgreement);
                for (Contract contract : arrayList ) {
                    if (contract.getContractnumber()==additionalAgreement.getAdditionalagreementnumber()) {
                        contract.addAdditionalagreements(additionalAgreement);
                    }
                }
            }
            return arrayList;
        } catch (SQLException ex) { ex.printStackTrace(); return null; }
    }
}