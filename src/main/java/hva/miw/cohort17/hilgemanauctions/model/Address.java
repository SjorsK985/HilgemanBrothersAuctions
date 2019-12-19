package hva.miw.cohort17.hilgemanauctions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressID;

    private String street;
    private int houseNumber;
    private String postcode;
    private String city;

    public Address(String street, int houseNumber, String postcode, String city){
        super();
        this.street = street;
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.city = city;
    }

    public Address(){
        super();
        this.street = "onbekend";
        this.houseNumber = 0;
        this.postcode = "onbekend";
        this.city = "onbekend";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
