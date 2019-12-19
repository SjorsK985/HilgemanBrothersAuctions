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

    private String brand;
    private String type;
    private String model;
    private String description;
    private Date yearOfManufacture;

    @OneToOne
    private User seller;
    private String category;
    private int startingBid;
    private int reserveBid;
    private Date closingDate;
    @OneToMany
    private List<Bid> bids;

    public Lot(){
        super();
    }

    public Lot(String brand, String type, String model, String description, Date yearOfManufacture, User seller, String category, int startingBid, int reserveBid, Date closingDate) {
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.description = description;
        this.yearOfManufacture = yearOfManufacture;
        this.seller = seller;
        this.category = category;
        this.startingBid = startingBid;
        this.reserveBid = reserveBid;
        this.closingDate = closingDate;
        this.bids = new ArrayList<>();
    }
}
