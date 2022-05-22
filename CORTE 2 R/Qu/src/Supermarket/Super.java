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

    public void addClients(){
        String name= JOptionPane.showInputDialog("Pls write the name of the person who wants to buy something in the supermarket ");
        String id= JOptionPane.showInputDialog("Pls write the id of the person who wants to buy something in the supermarket ");
         clients.add(new Clients(name,id));
    }
}
