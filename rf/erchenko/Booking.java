package rf.erchenko;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1 on 19.11.2016.
 */

class Booking {
    protected Date contractdate;
    protected Person person;
    protected HotelRoom hotelroom;
    protected float priceperday;
    protected byte howmanyspace;
    protected short howmanydays;
    protected Date checkindate;
    protected Date departuredate;

    public Booking(Date contractdate, float priceperday, Person person, HotelRoom hotelroom, byte howmanyspace, short howmanydays, Date checkindate, Date departuredate) {
        this.contractdate = contractdate;
        this.priceperday = priceperday;
        this.person = person;
        this.hotelroom = hotelroom;
        this.howmanyspace = howmanyspace;
        this.howmanydays = howmanydays;
        this.checkindate = checkindate;
        this.departuredate = departuredate;
    }

    public Date getContractdate() {
        return contractdate;
    }

    public void setContractdate(Date contractdate) {
        this.contractdate = contractdate;
    }

    public float getPriceperday() {
        return priceperday;
    }

    public void setPriceperday(float priceperday) {
        this.priceperday = priceperday;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public HotelRoom getHotelroom() {
        return hotelroom;
    }

    public void setHotelroom(HotelRoom hotelroom) {
        this.hotelroom = hotelroom;
    }

    public byte getHowmanyspace() {
        return howmanyspace;
    }

    public void setHowmanyspace(byte howmanyspace) {
        this.howmanyspace = howmanyspace;
    }

    public short getHowmanydays() {
        return howmanydays;
    }

    public void setHowmanydays(short howmanydays) {
        this.howmanydays = howmanydays;
    }

    public Date getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    public Date getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(Date departuredate) {
        this.departuredate = departuredate;
    }

    @Override
    public String toString() {
        DateFormat dF = new SimpleDateFormat("dd.MM.yyyy");
        return "Booking{" +
                "contractdate=" + dF.format(contractdate) +
                ", priceperday=" + priceperday +
                ", person=" + person +
                ", hotelroom=" + hotelroom +
                ", howmanyspace=" + howmanyspace +
                ", howmanydays=" + howmanydays +
                ", checkindate=" + dF.format(checkindate) +
                ", departuredate=" + dF.format(departuredate) +
                "}\n";
    }

    public String getToolTipString() {
        DateFormat dF = new SimpleDateFormat("dd.MM.yyyy");
        return "Бронирование номера от <b>" + dF.format(contractdate) +
                "<br>" + person.getLastname() + " " +person.getFirstname() + " " + person.getMiddlename() +
                "<br></b>с <b>" + dF.format(checkindate) + "</b> по <b>" + dF.format(departuredate) + "</b><br>" +
                " - - - - - - - - - - - - - - - - - - - - - - - - - - <br>";
    }
}
