package co.edu.cue.auctionsTest.model;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AuctionsHouse {
    Set<User> users = new HashSet<>();
    Set<Product> products = new HashSet<>();
    Set<Auction> auctions = new HashSet<>();

    public AuctionsHouse() {
        initializeUsers();
        initializeProducts();
    }

    private void initializeUsers() {
        users.add(new User("sjaramillo"));
        users.add(new User("Sergiotoby20"));
        users.add(new User("alcas23"));
        users.add(new User("Pablo43"));
        users.add(new User("pipe07"));
    }

    private void initializeProducts() {
        products.add(new Product("Ford's Car", 1000000));
        products.add(new Product("Picasso painting", 250000));
        products.add(new Product("Ancient Jar", 27000));
        products.add(new Product("Jordan´s Sneakers", 32000));
        products.add(new Product("Ronaldo's T-Shirt", 30000));
    }

    public void createAuction() {
        String userName = stringInput("Nombre de usuario:");
        String productName = stringInput("Nombre del producto:");
        User user = findUser(userName);
        Product product = findProduct(productName);

        if (user != null && product != null) {
            Auction foundAuction = findAuction(product);

            if (foundAuction != null) {
                if (foundAuction.getOffersAmount() == 3 || foundAuction.getUsers().contains(user)) {
                    System.out.println("Ya no puede ofertar por este producto");
                } else {
                    offer(foundAuction, user);
                }
            } else {
                Auction auction = new Auction(product);
                newOffer(auction, user);
            }
        } else {
            System.out.println("Error en los datos ingresados");
        }
    }

    private void newOffer(Auction auction, User user) {
        int amount = auction.getOffersAmount();
        double price = doubleInput("Cantidad a ofrecer por este producto:");

        if (price > auction.getPrice()) {
            auction.setPrice(price);
            auction.getUsers().add(user);
            auction.setOffersAmount(++amount);
            auctions.add(auction);
        } else {
            System.out.println("El precio ofertado está por debajo del valor actual");
        }
    }

    private void offer(Auction auction, User user) {
        int amount = auction.getOffersAmount();
        double price = doubleInput("Cantidad a ofrecer por este producto:");

        if (price > auction.getPrice()) {
            auction.setPrice(price);
            auction.getUsers().add(user);
            auction.setOffersAmount(++amount);
        } else {
            System.out.println("El precio ofertado está por debajo del valor actual");
        }
    }

    private Product findProduct(String productName) {
        for (Product product: products) {
            if (product.getName().equals(productName)) return product;
        }
        return null;
    }

    private User findUser(String userName) {
        for (User user: users) {
            if (user.getUserName().equals(userName)) return user;
        }
        return null;
    }

    private Auction findAuction(Product product) {
        for (Auction auction: auctions) {
            if (auction.getProduct().equals(product)) return auction;
        }
        return null;
    }

    private String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    private double doubleInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextDouble();
    }
}
