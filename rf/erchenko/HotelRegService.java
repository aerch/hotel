package rf.erchenko;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by 1 on 19.11.2016.
 */

class HotelRegService {
    public MSAccessDB mdb;
    private ArrayList<HotelRoom> hotelRoomList;
    private ArrayList<Booking> bookingList;
    private ArrayList<Contract> contractList;
    DateTimeUtils dtu = new DateTimeUtils();
    final static int colsCount = 16;
    static int rowsCount;

    public HotelRegService() {
        mdb = new MSAccessDB();
        mdb.rs = mdb.executeQuery("SELECT * FROM HotelRooms");
        hotelRoomList = mdb.loadHotelRoomList();
        rowsCount = hotelRoomList.size();
        mdb.setList(hotelRoomList);
    }

    void prepareStrArr() {
        int colsCount = Hotel.hrs.colsCount;
        int rowsCount = Hotel.hrs.rowsCount;
        ArrayList<Object> arrayList = new ArrayList<Object>();

        mdb.rs = mdb.executeQuery("SELECT * FROM Contracts WHERE ([Тип договора]='Заселение') AND ([Дата заезда]<DateValue('"+dtu.addDateToStr(13)+"') OR [Дата выезда]>=DateValue('"+dtu.addDateToStr(-1)+"'))");
        contractList = mdb.loadContractList();
        mdb.rs = mdb.executeQuery("SELECT * FROM Contracts WHERE ([Тип договора]='Допсоглашение') AND ([Дата заезда]<DateValue('"+dtu.addDateToStr(13)+"') OR [Дата выезда]>=DateValue('"+dtu.addDateToStr(-1)+"'))");
        contractList = mdb.loadAdditionalAgreementList(contractList);
        mdb.rs = mdb.executeQuery("SELECT * FROM Contracts WHERE ([Тип договора]='Бронирование') AND ([Дата заезда]<DateValue('"+dtu.addDateToStr(13)+"') OR [Дата выезда]>=DateValue('"+dtu.addDateToStr(-1)+"'))");
        bookingList = mdb.loadBookingList();

        // Init MainFrame.strArr[][] massive with null pointer
        for (int c=0; c < colsCount; c++) {
            for (int r = 0; r < rowsCount; r++) {
                MainFrame.strArr[c][r] = null;
            }
        }

        try {
            mdb.rs = mdb.executeQuery("select * from HotelRooms");

            for (int i=0; i<rowsCount; i++) {
                mdb.rs.next();
                MainFrame.strArr[0][i] = mdb.rs.getString("Наименование");
            }

            for (Contract contract : contractList ) {
                for (int c=1; c < colsCount; c++) {
                    for (int r=0; r < rowsCount; r++) {
                        if ( (dtu.addDays(c-2).compareTo(contract.getCheckindate())>=0) && (dtu.addDays(c-3).compareTo(contract.getDeparturedate())<=0) && (contract.getHotelroom().getCounter()==(r+1)) ) {
                            if (MainFrame.strArr[c][r] == null) { MainFrame.strArr[c][r] = new ArrayList<Object>(); };
                            arrayList = (ArrayList<Object>)MainFrame.strArr[c][r];
                            arrayList.add(contract);
                            MainFrame.strArr[c][r] = arrayList;
                        }
                        for (AdditionalAgreement additionalAgreement : contract.getAdditionalagreements() ) {
                            if ( (dtu.addDays(c-2).compareTo(additionalAgreement.getCheckindate())>=0) && (dtu.addDays(c-3).compareTo(additionalAgreement.getDeparturedate())<=0) && (additionalAgreement.getHotelroom().getCounter()==(r+1)) ) {
                                if (MainFrame.strArr[c][r] == null) { MainFrame.strArr[c][r] = new ArrayList<Object>(); };
                                arrayList = (ArrayList<Object>)MainFrame.strArr[c][r];
                                arrayList.add(0,additionalAgreement);
                                MainFrame.strArr[c][r] = arrayList;
                            }
                        }
                    }
                }
            }

            for (Booking booking : bookingList ) {
                for (int c=1; c <= colsCount; c++) {
                    for (int r=0; r < rowsCount; r++) {
                        if ( (dtu.addDays(c-2).compareTo(booking.getCheckindate())>=0) && (dtu.addDays(c-3).compareTo(booking.getDeparturedate())<=0) && (booking.getHotelroom().getCounter()==(r+1)) ) {
                            if (MainFrame.strArr[c][r] == null) { MainFrame.strArr[c][r] = new ArrayList<Object>(); };
                            arrayList = (ArrayList<Object>)MainFrame.strArr[c][r];
                            arrayList.add(booking);
                            MainFrame.strArr[c][r] = arrayList;
                        }
                        //arrayList = null;
                    }
                }
            }

        } catch (SQLException ex) { ex.printStackTrace(); }
    }

    public ArrayList<HotelRoom> getHotelRoomList() {
        return hotelRoomList;
    }

}
