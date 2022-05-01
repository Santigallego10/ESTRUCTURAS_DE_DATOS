package co.edu.cue.auctionsTest.model;

import java.util.HashSet;
import java.util.Set;

public class Auction {
    private Product product;
    private int offersAmount = 0;
    private double price;
    private Set<User> users = new HashSet<>();

    public Auction(Product product) {
        this.product = product;
        this.price = product.getInitialPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOffersAmount() {
        return offersAmount;
    }

    public void setOffersAmount(int offersAmount) {
        this.offersAmount = offersAmount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "product=" + product +
                ", offersAmount=" + offersAmount +
                ", price=" + price +
                ", users=" + users +
                '}';
    }
}
