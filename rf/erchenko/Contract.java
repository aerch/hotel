package rf.erchenko;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by 1 on 19.11.2016.
 */

class Contract extends Booking {
    private int contractnumber;
    private String contractyear;
    private int invoicenumber;
    private String invoiceseries;
    private String receiptorderseries;
    private ArrayList<AdditionalAgreement> additionalagreements;

    public Contract(Date contractdate, float priceperday, Person person, HotelRoom hotelroom, byte howmanyspace, short howmanydays, Date checkindate, Date departuredate, int contractnumber, String contractyear, int invoicenumber, String invoiceseries, String receiptorderseries, AdditionalAgreement additionalagreement) {
        super(contractdate, priceperday, person, hotelroom, howmanyspace, howmanydays, checkindate, departuredate);
        this.contractnumber = contractnumber;
        this.contractyear = contractyear;
        this.invoicenumber = invoicenumber;
        this.invoiceseries = invoiceseries;
        this.receiptorderseries = receiptorderseries;
        this.additionalagreements = new ArrayList<AdditionalAgreement>();
    }

    public int getContractnumber() { return contractnumber;  }

    public void setContractnumber(int contractnumber) { this.contractnumber = contractnumber; }

    public String getContractyear() { return contractyear; }

    public void setContractyear(String contractyear) { this.contractyear = contractyear; }

    public int getInvoicenumber() { return invoicenumber; }

    public void setInvoicenumber(int invoicenumber) { this.invoicenumber = invoicenumber; }

    public String getInvoiceseries() { return invoiceseries; }

    public void setInvoiceseries(String invoiceseries) { this.invoiceseries = invoiceseries; }

    public String getReceiptorderseries() { return receiptorderseries; }

    public void setReceiptorderseries(String receiptorderseries) { this.receiptorderseries = receiptorderseries; }

    public ArrayList<AdditionalAgreement> getAdditionalagreements() { return additionalagreements; }

    public void setAdditionalagreements(ArrayList<AdditionalAgreement> additionalagreements) { this.additionalagreements = additionalagreements; }

    public void addAdditionalagreements(AdditionalAgreement additionalagreement) {
        this.additionalagreements.add(additionalagreement);
    }

    @Override
    public String toString() {
        DateFormat dF = new SimpleDateFormat("dd.MM.yyyy");
        return "Contract{" +
                "contractnumber=" + contractnumber +
                ", invoicenumber=" + invoicenumber +
                ", " + super.toString() +
                ", additionalagreements=" + additionalagreements.toString() +
                "}";
    }

    public String getToolTipString() {
        DateFormat dF = new SimpleDateFormat("dd.MM.yyyy");
        return "Договор заселения <b>№" + contractnumber + "/0/" + contractyear +"</b> от <b>" + dF.format(contractdate) +
                "<br>" + person.getLastname() + " " +person.getFirstname() + " " + person.getMiddlename() +
                "<br></b>c <b>" + dF.format(checkindate) + "</b> по <b>" + dF.format(departuredate) + "</b><br>" +
                " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - <br>";
    }
}
