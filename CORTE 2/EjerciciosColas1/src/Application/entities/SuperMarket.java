package Application.entities;

import Application.CashThreads;

import java.util.*;

public class SuperMarket {

    private String name;
    private int shoppingCartsAmount;
    private int shoppingCartAvailable;
    private List<CashRegister> cashRegisterList = new ArrayList<>();
    private Queue<Client> waitList;

    public SuperMarket() {
    }

    public SuperMarket(String name,int shoppingCartsAmount) {
        this.name = name;
        this.shoppingCartsAmount = shoppingCartsAmount;
        this.waitList = new LinkedList<>();
        this.shoppingCartAvailable = this.shoppingCartsAmount;
        this.cashRegisterList.add(new CashRegister(1));
        this.cashRegisterList.add(new CashRegister(2));
        this.cashRegisterList.add(new CashRegister(3));
    }

    //MY METHODS

    //this method removes the next client on the wait line and returns him
    public Client giveCar(){
        Client client = this.waitList.peek();
        this.waitList.remove();
        this.shoppingCartAvailable--;
        return client;
    }

    public void addClient(Client c){
        this.getWaitList().add(c);
    }

    public void findCash(Client c){
        int min = this.cashRegisterList.get(0).getClientes().size();
        CashRegister crMin = this.cashRegisterList.get(0);
        for (CashRegister cr :this.cashRegisterList) {
            if(cr.getClientes().size() < min){
                crMin = cr;
            }
        }
        crMin.getClientes().add(c);
        System.out.println("El "+c.getName()+" fue asignado a la caja "+crMin.getId());
        String cadena = "";
        Iterator<Client> it = crMin.getClientes().iterator();
        /*
        while (it.hasNext()){
            Client i = it.next();
            cadena+= i.getName()+", ";
        }

         */
        //System.out.println("----LISTA CAJA "+crMin.getId()+cadena+"----");
        CashThreads cashThreads = new CashThreads(c, crMin,this);
        cashThreads.start();
    }

    //GETTERS AND SETTERS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShoppingCartAvailable() {
        return shoppingCartAvailable;
    }

    public void setShoppingCartAvailable(int shoppingCartAvailable) {
        this.shoppingCartAvailable = shoppingCartAvailable;
    }

    public int getShoppingCartsAmount() {
        return shoppingCartsAmount;
    }

    public void setShoppingCartsAmount(int shoppingCartsAmount) {
        this.shoppingCartsAmount = shoppingCartsAmount;
    }

    public Queue<Client> getWaitList() {
        return waitList;
    }

    public void setWaitList(Queue<Client> waitList) {
        this.waitList = waitList;
    }

    public List<CashRegister> getCashRegisterList() {
        return cashRegisterList;
    }

    public void setCashRegisterList(List<CashRegister> cashRegisterList) {
        this.cashRegisterList = cashRegisterList;
    }
}
