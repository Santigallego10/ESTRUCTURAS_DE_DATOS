package app.application;

import app.entities.Auction;
import app.entities.Product;
import app.entities.User;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        products = createProducts();
        users = createUsers();
        boolean flag = true;
        String[] options = {"Exit", "Create auction", "Auctions List"};
        while (flag){

            //main page
            int x = JOptionPane.showOptionDialog(null, "Select an option:",
                    "Click on the option",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            System.out.println(x);

            switch (x){
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    createAuction(users, products);
                    System.out.println("Create");
                    break;
                case 2:
                    System.out.println("List");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"You need to select a valid option");
            }
        }
    }

    //PRODUCT METHODS

    public static List<Product> createProducts(){
        List<Product> products = new ArrayList<>();
        Product product =  new Product("Boat","Modern boat, Black and White");
        Product product2 =  new Product("Car","Audi, black, 2020");
        Product product3 =  new Product("House","Modern house, florida state");
        products.add(product);
        products.add(product2);
        products.add(product3);
        return products;
    }


    //USER METHODS

    public static List<User> createUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User("Santiago","Gallego","sgallego1022@cue.edu.co","SantiG","1234");
        users.add(user1);
        return users;
    }



    private static User logIn(List<User> users) {
        User user = null;
        String userName = JOptionPane.showInputDialog("Write your userName:");
        for(User i: users){
            if(i.getUsername().equalsIgnoreCase(userName)){
                return i;
            }else {
                return null;
            }
        }
        return null;
    }

    //AUCTION METHODS

    private static void createAuction(List<User> users, List<Product> products) {
        Product auctionProduct = null;
        User user = logIn(users);
        int cont = 1;
        String productList = "PRODUCT LIST: \n";
        for (Product i: products) {
            productList += cont+". " + i.getProductName()+"\n";
            cont++;
        }
        String x = JOptionPane.showInputDialog("Write the name of the product you want to sell: "+"\n"+productList);
        for (Product p: products) {
            if(p.getProductName().equalsIgnoreCase(x)){
                auctionProduct = p;
            }
        }
        Auction auction = new Auction();
        auction.setSeller(user);
        auction.setCreationDay(getTime());
        auction.setClosed(false);
        double price = Double.parseDouble(JOptionPane.showInputDialog("Write the initial price for the auction"));
        auction.setStartPrice(price);
        auction.setProduct(auctionProduct);

        JOptionPane.showMessageDialog(null,"Your auction has been created successfully with the next details: \n" +
                auction.toString());

    }

    private static String getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }


}
