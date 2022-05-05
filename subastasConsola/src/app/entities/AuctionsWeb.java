package app.entities;

import java.util.ArrayList;
import java.util.List;

public class AuctionsWeb {

    private List<User> users = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private List<Auction> auctions = new ArrayList<>();

    public AuctionsWeb(){

    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Auction> getAuctions() {
        return auctions;
    }

    public void setAuctions(List<Auction> auctions) {
        this.auctions = auctions;
    }
}
