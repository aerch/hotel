package rf.erchenko;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1 on 19.11.2016.
 */

class Person {
    private String firstname;
    private String middlename;
    private String lastname;
    private IdentificationDocument identificationDocument;
    private Date birthdate;
    private String address;

    public Person(String firstname, String middlename, String lastname, IdentificationDocument identificationDocument, Date birthdate, String address) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.identificationDocument = identificationDocument;
        this.birthdate = birthdate;
        this.address = address;
    }

    public String getFirstname() {
        return ( firstname == null ? "" : firstname );
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return ( middlename == null ? "" : middlename );
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return ( lastname == null ? "" : lastname );
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public IdentificationDocument getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(IdentificationDocument identificationDocument) {
        this.identificationDocument = identificationDocument;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        DateFormat dF = new SimpleDateFormat("dd.MM.yyyy");
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastname='" + lastname + '\'' +
                ", identificationDocument=" + identificationDocument +
                ", birthdate=" + (birthdate==null ? "null" : dF.format(birthdate)) +
                ", address='" + address + '\'' +
                "}";
    }
}

