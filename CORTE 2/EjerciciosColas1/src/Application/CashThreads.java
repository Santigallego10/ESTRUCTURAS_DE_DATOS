package Application;

import Application.entities.CashRegister;
import Application.entities.Client;
import Application.entities.SuperMarket;

import java.util.Random;

public class CashThreads extends Thread{

    public SuperMarket sm;

    public CashRegister cashRegister;

    public Client client;

    public CashThreads(Client client, CashRegister cr, SuperMarket sm){
        this.client = client;
        this.sm = sm;
        this.cashRegister = cr;
    }

    public void run(){
        waitXSeconds();
    }

    private void waitXSeconds(){
        int min = 1;
        int max = 5;

        Random random = new Random();

        int value = random.nextInt(max + min) + min;
        try {
            System.out.println("esperando a que el cajero  "+this.cashRegister.getId()+"atienda a el " +this.client.getName());
            currentThread().sleep(value * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.client.getName() + " fue atendido y se fue :)");
    }
}
