package rf.erchenko;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1 on 19.11.2016.
 */

class AdditionalAgreement extends Booking {
    private int contractnumber;
    private String contractyear;
    private int additionalagreementnumber;
    private int invoicenumber;
    private String invoiceseries;
    private String receiptorderseries;

    public AdditionalAgreement(Date additionalagreementdate, float priceperday, Person person, HotelRoom hotelroom, byte howmanyspace, short howmanydays, Date checkindate, Date departuredate, int contractnumber, String contractyear, int additionalagreementnumber, int invoicenumber, String invoiceseries, String receiptorderseries) {
        super(additionalagreementdate, priceperday, person, hotelroom, howmanyspace, howmanydays, checkindate, departuredate);
        this.contractnumber = contractnumber;
        this.contractyear = contractyear;
        this.additionalagreementnumber = additionalagreementnumber;
        this.invoicenumber = invoicenumber;
        this.invoiceseries = invoiceseries;
        this.receiptorderseries = receiptorderseries;
    }

    public int getAdditionalagreementnumber() {
        return additionalagreementnumber;
    }

    public void setAdditionalagreementnumber(int additionalagreementnumber) {
        this.additionalagreementnumber = additionalagreementnumber;
    }

    public int getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(int invoicenumber) {
        this.invoicenumber = invoicenumber;
    }

    @Override
    public String toString() {
        DateFormat dF = new SimpleDateFormat("dd.MM.yyyy");
        return "AdditionalAgreement{" +
                "additionalagreementnumber=" + additionalagreementnumber +
                ", invoicenumber=" + invoicenumber +
                ", " + super.toString() + "}";
    }

    @Override
    public String getToolTipString() {
        DateFormat dF = new SimpleDateFormat("dd.MM.yyyy");
        return "Дополнительное соглашение <b>№" + contractnumber + "/" + additionalagreementnumber + "/" + contractyear +"</b> от <b>" + dF.format(contractdate) +
                "<br>" + person.getLastname() + " " +person.getFirstname() + " " + person.getMiddlename() +
                "<br></b>c <b>" + dF.format(checkindate) + "</b> по <b>" + dF.format(departuredate) + "</b><br>" +
                " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - <br>";
    }

}
