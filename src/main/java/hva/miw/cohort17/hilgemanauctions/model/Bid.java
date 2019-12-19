package hva.miw.cohort17.hilgemanauctions.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bidID;
    private int bidAmount;

    @OneToOne
    private User bidder;
    private boolean autoBid;
    private Date timeStamp;

    public Bid(){
        super();
    }

    public Bid(int bidAmount, User bidder, boolean autoBid, Date timeStamp) {
        this.bidAmount = bidAmount;
        this.bidder = bidder;
        this.autoBid = autoBid;
        this.timeStamp = timeStamp;
    }

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public User getBidder() {
        return bidder;
    }

    public void setBidder(User bidder) {
        this.bidder = bidder;
    }

    public boolean isAutoBid() {
        return autoBid;
    }

    public void setAutoBid(boolean autoBid) {
        this.autoBid = autoBid;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
