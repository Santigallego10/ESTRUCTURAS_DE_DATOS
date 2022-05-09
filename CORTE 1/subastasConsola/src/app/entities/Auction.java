package app.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Auction {

    private User seller;
    private String creationDay;
    private Boolean closed;
    private double startPrice;
    private Product product;
    private Set<User> offers = new HashSet<>();

    public Auction(){
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public String getCreationDay() {
        return creationDay;
    }

    public void setCreationDay(String creationDay) {
        this.creationDay = creationDay;
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



    @Override
    public String toString() {
        return "Auction{" +
                "seller=" + seller.getUsername() +
                ", creationDay='" + creationDay + '\'' +
                ", closed=" + closed +
                ", startPrice=" + startPrice +
                ", product=" + product.getProductName() +
                '}';
    }
}
