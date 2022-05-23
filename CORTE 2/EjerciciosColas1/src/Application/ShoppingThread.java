package Application;

import Application.entities.CashRegister;
import Application.entities.Client;
import Application.entities.SuperMarket;

import java.util.List;
import java.util.Random;

public class ShoppingThread extends Thread{

    public Client client;

    public ShoppingThread(Client client) {
        this.client = client;
    }

    public void run(SuperMarket sm){
        waitXSeconds(sm);
    }

    private void waitXSeconds(SuperMarket sm) {

        int min = 1;
        int max = 5;

        Random random = new Random();

        int value = random.nextInt(max + min) + min;
        try {
            System.out.println("esperando a "+this.client.getName());
            currentThread().sleep(value * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished "+this.client.getName());
        List<CashRegister> listC = sm.getCashRegisterList();
        int mayor = listC.get(0).getClientes().size();
        for (CashRegister cr: listC) {
            if(mayor < cr.getClientes().size()){
                mayor = cr.getClientes().size();
            }
        }

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
