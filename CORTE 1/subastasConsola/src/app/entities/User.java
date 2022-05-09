package app.entities;

import java.util.*;

public class User {

    private String name;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private Set<Auction> offers =  new HashSet();
    private List<Auction> userAuctions = new ArrayList();

    public User(){

    }

    public User(String name, String lastName, String email, String username, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Auction> getOffers() {
        return offers;
    }

    public void setOffers(Set<Auction> offers) {
        this.offers = offers;
    }

    public List<Auction> getUserAuctions() {
        return userAuctions;
    }

    public void setUserAuctions(List<Auction> userAuctions) {
        this.userAuctions = userAuctions;
    }
}
