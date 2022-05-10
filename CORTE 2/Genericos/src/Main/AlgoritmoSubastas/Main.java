package Main.AlgoritmoSubastas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("House", 100.000);
        Product product2 = new Product("Boat", 100.000);

        Auction auction = new Auction(1, product);
        Auction auction2 = new Auction(2, product2);

        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        List<Auction> auctionsList = new ArrayList<>();
        auctionsList.add(auction);
        auctionsList.add(auction2);


        System.out.println(printList(auctionsList));
        System.out.println(printList(products));



    }

    public static <T> String printList(List<T> c){
        String cadena = "";
        for (T t:c) {
            cadena+=t.toString();
        }
        return cadena;
    }
}
