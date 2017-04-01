package rf.erchenko;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1 on 19.11.2016.
 */

class IdentificationDocument {
    private String document;
    private String serial;
    private String number;
    private String issuedby;
    private Date dateofissue;

    public IdentificationDocument(String document, String serial, String number, String issuedby, Date dateofissue) {
        this.document = document;
        this.serial = serial;
        this.number = number;
        this.issuedby = issuedby;
        this.dateofissue = dateofissue;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIssuedby() {
        return issuedby;
    }

    public void setIssuedby(String issuedby) {
        this.issuedby = issuedby;
    }

    public Date getDateofissue() {
        return dateofissue;
    }

    public void setDateofissue(Date dateofissue) {
        this.dateofissue = dateofissue;
    }

    @Override
    public String toString() {
        DateFormat dF = new SimpleDateFormat("dd.MM.yyyy");
        return "IdentificationDocument{" +
                "document='" + document + '\'' +
                ", serial='" + serial + '\'' +
                ", number='" + number + '\'' +
                ", issuedby='" + issuedby + '\'' +
                ", dateofissue='" + (dateofissue==null ? "null" : dF.format(dateofissue)) +
                "'}";
    }
}

