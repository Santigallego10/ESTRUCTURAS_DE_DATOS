package exercise1.supermercado.colas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Supermarket {

    private int amountShoppingCarts;
    private List<Client> clients= new ArrayList<>();
    private Queue<Client>box1= new LinkedList<>();
    private Queue<Client>box2= new LinkedList<>();
    private Queue<Client>box3= new LinkedList<>();


    public Supermarket(int max){
        this.amountShoppingCarts=max;
        this.addClients();
    }

    public Supermarket(int amountShoppingCarts, List<Client> clients, Queue<Client> box1, Queue<Client> box2, Queue<Client> box3) {
        this.amountShoppingCarts = amountShoppingCarts;
        this.clients = clients;
        this.box1 = box1;
        this.box2 = box2;
        this.box3 = box3;
    }

    public int getAmountShoppingCarts() {
        return amountShoppingCarts;
    }

    public void setAmountShoppingCarts(int amountShoppingCarts) {
        this.amountShoppingCarts = amountShoppingCarts;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Queue<Client> getBox1() {
        return box1;
    }

    public void setBox1(Queue<Client> box1) {
        this.box1 = box1;
    }

    public Queue<Client> getBox2() {
        return box2;
    }

    public void setBox2(Queue<Client> box2) {
        this.box2 = box2;
    }

    public Queue<Client> getBox3() {
        return box3;
    }

    public void setBox3(Queue<Client> box3) {
        this.box3 = box3;
    }
    

    public void addClients(){
        Client client= new Client();
        client.setName("Oscar");
        client.setId("1");
        clients.add(client);

        client= new Client();
        client.setName("Maria");
        client.setId("2");
        clients.add(client);

        client= new Client();
        client.setName("Fernanda");
        client.setId("3");
        clients.add(client);

        client= new Client();
        client.setName("Santiago");
        client.setId("4");
        clients.add(client);

        client= new Client();
        client.setName("Samuel");
        client.setId("5");
        clients.add(client);

        client= new Client();
        client.setName("David");
        client.setId("6");
        clients.add(client);

        client= new Client();
        client.setName("Karol");
        client.setId("7");
        clients.add(client);

        client= new Client();
        client.setName("Liz");
        client.setId("8");
        clients.add(client);

        client= new Client();
        client.setName("Manuela");
        client.setId("9");
        clients.add(client);

        client= new Client();
        client.setName("Valeria");
        client.setId("10");
        clients.add(client);

        client= new Client();
        client.setName("Jose");
        client.setId("11");
        clients.add(client);

        client= new Client();
        client.setName("Manuel");
        client.setId("12");
        clients.add(client);

        client= new Client();
        client.setName("Felipe");
        client.setId("13");
        clients.add(client);

        client= new Client();
        client.setName("Mauricio");
        client.setId("14");
        clients.add(client);

        client= new Client();
        client.setName("Paola");
        client.setId("15");
        clients.add(client);

        System.out.println("The supermarket have clients");
    }


//        else if (q2.size() == q3.size()) {
//            return 2;
//        }
//        return 3;

    public void fillQueues(){
        String id= JOptionPane.showInputDialog("Enter the client id: ");
        Client client= searchClient(id);
        if (client!=null) {
            if (box1.size()>0) {
                if (box2.size()>0) {
                    if (box3.size()>0) {
                         if (box1.size() < box2.size() && box1.size() < box3.size()) {
                            box1.add(client);
                            clients.remove(client);
                            System.out.println("The client " + client.getName() + " is in the box 1");
                        } else if (box2.size() < box1.size() && box2.size() < box3.size()) {
                            box2.add(client);
                            clients.remove(client);
                            System.out.println("The client " + client.getName() + " is in the box 2");
                        } else if (box3.size() < box1.size() && box3.size() < box2.size()) {
                            box3.add(client);
                            clients.remove(client);
                            System.out.println("The client " + client.getName() + " is in the box 3");
                        } else if (box1.size() == box2.size()) {
                             box1.add(client);
                             System.out.println("The client " + client.getName() + " is in the box 1");
                         } else if (box2.size()==box3.size()) {
                             box2.add(client);
                             System.out.println("The client " + client.getName() + " is in the box 2");
                         } else if (box3.size()==box1.size()) {
                             box3.add(client);
                             System.out.println("The client " + client.getName() + " is in the box 3");
                         }
                    }else if (box3.size() == 0) {
                        System.out.println("The box 3 dont have people, you can choice this "+ client.getName());
                        box3.add(client);
                        clients.remove(client);
                    }
                } else if (box2.size() == 0) {
                    System.out.println("The box 2 dont have people, you can choice this "+ client.getName());
                    box2.add(client);
                    clients.remove(client);
                }
            }else if (box1.size() == 0) {
                System.out.println("The box 1 dont have people, you can choice this " + client.getName());
                box1.add(client);
                clients.remove(client);
            }
        } else
            System.out.println("The client is not registered");
    }


    public void takeCart(){
        String id= JOptionPane.showInputDialog("Enter the client id: ");

        Client client= searchClient(id);
        if (client!=null) {
            if (this.amountShoppingCarts!=0) {
                System.out.println("The client "+ client.getName()+ " have a shopping cart");
                this.amountShoppingCarts--;
                //System.out.println("Totally amount for Shopping carts: "+amountShoppingCarts);
            } else
                System.out.println("Wait some time for a shopping cart...");
        } else
            System.out.println("The client is not registered");
    }

    public void seeQueueBox(){
        System.out.println(box1.size());
        System.out.println(box2.size());
        System.out.println(box3.size());
    }


    public Client searchClient(String id){
       Client clientExist= null;
        if (clients.size()>0) {
            for (Client client: clients) {
                if (client.getId().equalsIgnoreCase(id)) {
                    clientExist=client;
                }
            }
        }
        return clientExist ;
    }

}
