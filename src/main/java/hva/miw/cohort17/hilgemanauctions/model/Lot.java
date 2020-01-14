package hva.miw.cohort17.hilgemanauctions.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lotID;
    private String category;
    private String brand;
    private String type;
    private String model;
    private String description;
    private String yearOfManufacture;
    private double startingBid;

    @OneToOne
    private User seller;

    public Lot(){
        super();
    }

    public Lot(String category, String brand, String type, String model, String description, String yearOfManufacture, double startingBid, User seller) {
        this.category = category;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.description = description;
        this.yearOfManufacture = yearOfManufacture;
        this.startingBid = startingBid;
        this.seller = seller;
    }

    public int getLotID() {
        return lotID;
    }

    public void setLotID(int lotID) {
        this.lotID = lotID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public double getStartingBid() {
        return startingBid;
    }

    public void setStartingBid(double startingBid) {
        this.startingBid = startingBid;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }
}
