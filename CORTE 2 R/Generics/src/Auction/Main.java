package Auction;

import java.util.ArrayList;
import java.util.List;

public class Main <T> {
    public static void main(String[] args) {

        List<Product> product = new ArrayList<>();
        Product product1 = new Product("Hello kitty coleccionable", 200.000);
        product.add(product1);
        Product product2 = new Product("Harry styles ken", 500.000);
        product.add(product2);

        List<Auction> auction = new ArrayList<>();
        Auction auction1 = new Auction(product1, "AFHHG");
        auction.add(auction1);
        Auction auction2 = new Auction(product2, "GHAHHA");
        auction.add(auction2);

        for (Object o: product) {
            if (o instanceof Product) {
                Product product3 = (Product) o;
                System.out.println(product3.getName());
            } else {
                Auction auction3 = (Auction) o;
                System.out.println(auction3.getId());
            }
        }

    }



    }

