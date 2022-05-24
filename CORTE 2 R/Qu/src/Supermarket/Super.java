package Supermarket;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Super {

    Queue<Clients> firstCart= new PriorityQueue<>();
    Queue<Clients>secondCart = new PriorityQueue<>();
    Queue<Clients>thirdCart= new PriorityQueue<>();
    List<Clients> clients = new ArrayList<>();
    private int amountOfCarts;

    public Super(int amountOfCarts) {
        this.amountOfCarts = 15;
    }

    public void getACart(){
        if(this.amountOfCarts==0) {
            System.out.println("There is no carts");
        }else{

        }
    }

    public Queue<Clients> getFirstCart() {
        return firstCart;
    }

    public void setFirstCart(Queue<Clients> firstCart) {
        this.firstCart = firstCart;
    }

    public Queue<Clients> getSecondCart() {
        return secondCart;
    }

    public void setSecondCart(Queue<Clients> secondCart) {
        this.secondCart = secondCart;
    }

    public Queue<Clients> getThirdCart() {
        return thirdCart;
    }

    public void setThirdCart(Queue<Clients> thirdCart) {
        this.thirdCart = thirdCart;
    }

    public List<Clients> getClients() {
        return clients;
    }

    public void setClients(List<Clients> clients) {
        this.clients = clients;
    }

    public int getAmountOfCarts() {
        return amountOfCarts;
    }

    public void setAmountOfCarts(int amountOfCarts) {
        this.amountOfCarts = amountOfCarts;
    }



    public void addClients(){
        String name= JOptionPane.showInputDialog("Pls write the name of the person who wants to buy something in the supermarket ");
        String id= JOptionPane.showInputDialog("Pls write the id of the person who wants to buy something in the supermarket ");
         clients.add(new Clients(name,id));
    }
}
