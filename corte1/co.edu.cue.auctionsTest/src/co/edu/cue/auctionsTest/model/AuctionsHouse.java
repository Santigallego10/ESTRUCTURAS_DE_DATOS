package co.edu.cue.auctionsTest.model;

import java.util.HashSet;
import java.util.Set;

public class AuctionsHouse {
    Set<User> users = new HashSet<>();
    Set<Product> products = new HashSet<>();

    public AuctionsHouse() {
        initializeUsers();
        initializeProducts();
    }

    public void initializeUsers() {
        users.add(new User("sjaramillo"));
        users.add(new User("Sergiotoby20"));
        users.add(new User("alcas23"));
        users.add(new User("Pablo43"));
        users.add(new User("pipe07"));
    }

    public void initializeProducts() {
        products.add(new Product("Ford's Car", 1000));
        products.add(new Product("Picasso painting", 2000));
        products.add(new Product("Ancient Jar", 27000));
        products.add(new Product("Jordan´s Sneakers", 500));
        products.add(new Product("Ronaldo's T-Shirt", 3000));
    }
}
