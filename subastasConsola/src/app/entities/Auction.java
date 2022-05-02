package app.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Auction {

    private int id;
    private User seller;
    private Date creationDay;
    private Date finishingDay;
    private Boolean closed;
    private double startPrice;
    private Product product;
    private Set<User> offers = new HashSet<>();

    public Auction(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Date getCreationDay() {
        return creationDay;
    }

    public void setCreationDay(Date creationDay) {
        this.creationDay = creationDay;
    }

    public Date getFinishingDay() {
        return finishingDay;
    }

    public void setFinishingDay(Date finishingDay) {
        this.finishingDay = finishingDay;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Set<User> getOffers() {
        return offers;
    }

    public void setOffers(Set<User> offers) {
        this.offers = offers;
    }
}
