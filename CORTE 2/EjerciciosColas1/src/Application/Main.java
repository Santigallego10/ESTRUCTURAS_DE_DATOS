package Application;

import Application.entities.Client;
import Application.entities.SuperMarket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        SuperMarket superMarket = new SuperMarket("Carulla",15);

        //Creating a specific amount of clients that will enter to the SuperMarket
        int clients_amount = 30;

        for (int i = 0; i < clients_amount; i++) {
            superMarket.getWaitList().add(new Client("Cliente "+(i+1)));
        }

        System.out.println("SuperMercado Abierto!");

        while (true){
            for (int i = 0; i < clients_amount; i++) {
                if(superMarket.getShoppingCartAvailable()>0 && !superMarket.getWaitList().isEmpty()){
                    Client client = superMarket.giveCar();
                    ShoppingThread sp = new ShoppingThread(client, superMarket);
                    sp.start();
                }
            }
        }


    }
}
