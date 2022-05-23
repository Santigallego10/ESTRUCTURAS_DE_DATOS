package Application;

import Application.entities.Client;
import Application.entities.SuperMarket;

import java.util.Random;

public class ShoppingThread extends Thread{

    public Client client;

    public ShoppingThread(Client client) {
        this.client = client;
    }

    public void run(){
        waitXSeconds();
    }

    private void waitXSeconds() {

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
        /*
        List<CashRegister> listC = this.sm.getCashRegisterList();
        int menor = listC.get(0).getClientes().size();
        CashRegister mincash = null;
        for (CashRegister cr: listC) {
            if(menor > cr.getClientes().size()){
                menor = cr.getClientes().size();
                mincash = cr;
            }
        }
        System.out.println("id "+mincash.getId());
        mincash.getClientes().add(this.client);

         */



        System.out.println("El  "+this.client.getName()+" termino de comprar en "+value+" seg");
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
