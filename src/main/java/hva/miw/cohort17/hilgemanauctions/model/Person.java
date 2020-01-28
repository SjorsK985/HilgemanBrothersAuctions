package hva.miw.cohort17.hilgemanauctions.model;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private int userID;
    private String email;
    private String password;
    private LocalDate dateOfRegistration;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Bankaccount bankaccount;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address address;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Lot> lotsForSale;

    @OneToMany
    private List<Lot> savedItems;

    public User(){
        super();
    }

    public User(String email, String password, Address address, Bankaccount bankaccount){
        this.email = email;
        this.password = password;
        this.address = address;
        this.dateOfRegistration = LocalDate.now();
        this.bankaccount = bankaccount;
        this.lotsForSale = new ArrayList<>();
        this.savedItems = new ArrayList<>();
    }

    public User(String email, String password, Bankaccount bankaccount){
        this(email, password, new Address(), bankaccount);
    }

    public void addLotToSell(Lot lot){
        lotsForSale.add(lot);
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

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Bankaccount getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(Bankaccount bankaccount) {
        this.bankaccount = bankaccount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Lot> getLotsForSale() {
        return lotsForSale;
    }

    public void setLotsForSale(List<Lot> lotsForSale) {
        this.lotsForSale = lotsForSale;
    }

    public List<Lot> getSavedItems() {
        return savedItems;
    }

    public void setSavedItems(List<Lot> savedItems) {
        this.savedItems = savedItems;
    }
}
