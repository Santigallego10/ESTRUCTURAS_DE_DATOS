package Application;

import Application.entities.Client;
import Application.entities.SuperMarket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        SuperMarket superMarket = new SuperMarket("Carulla",15);

        //Creating a specific amount of clients that will enter to the SuperMarket
        int clients_amount = 25;

        for (int i = 0; i < clients_amount; i++) {
            superMarket.getWaitList().add(new Client("Cliente "+(i+1)));
        }

        System.out.println("SuperMercado Abierto!");

        while (superMarket.getShoppingCartAvailable() > 0 && !superMarket.getWaitList().isEmpty()){
            for (int i = 0; i < clients_amount; i++) {
                Client client = superMarket.giveCar();
                ShoppingThread sp = new ShoppingThread(client);
                sp.start();
            }
        }


    }
}
