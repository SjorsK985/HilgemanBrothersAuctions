package hva.miw.cohort17.hilgemanauctions.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    private String email;
    private String password;
    private String firstName;
    private String prepositions;
    private String lastName;

    @OneToOne
    private Address address;

    @ManyToMany
    private List<Lot> lotsWon;

    public User(){
        super();
    }

    public User(String email, String password, String firstName, String prepositions, String lastName){
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.prepositions = prepositions;
        this.lastName = lastName;
        this.address = new Address();
        this.lotsWon = new ArrayList<>();
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPrepositions() {
        return prepositions;
    }

    public void setPrepositions(String prepositions) {
        this.prepositions = prepositions;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
