package co.edu.cue.auctionsTest.model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AuctionsHouse {
    Set<User> users = new HashSet<>();
    Set<Product> products = new HashSet<>();
    Set<Product> auctions = new HashSet<>();
    Set<Product> soldProducts = new HashSet<>();

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
        products.add(new Product("Ford's Car", 1000000));
        products.add(new Product("Picasso painting", 250000));
        products.add(new Product("Ancient Jar", 27000));
        products.add(new Product("Jordan´s Sneakers", 32000));
        products.add(new Product("Ronaldo's T-Shirt", 30000));
    }

    public void createAuction() {
        String userName = stringInput("Nombre de usuario");
        String productName = stringInput("Nombre del producto");
        User user = findUser(userName);
        Product product = findProduct(productName);

        if (user != null && product != null) {
            if (auctions.contains(product)) {

            } else {
                Auction auction = new Auction(product);
                double price = doubleInput("Cantidad a ofrecer por este producto");

                if (price > auction.getPrice()) {

                } else {
                    System.out.println("El precio ofertado está por debajo del valor actual");
                }
            }
        } else {
            System.out.println("Error en los datos ingresados");
        }
    }

    public Product findProduct(String productName) {
        for (Product product: products) {
            if (product.getName().equals(productName)) return product;
        }
        return null;
    }

    public User findUser(String userName) {
        for (User user: users) {
            if (user.getUserName().equals(userName)) return user;
        }
        return null;
    }

    public String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public double doubleInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextDouble();
    }
}
