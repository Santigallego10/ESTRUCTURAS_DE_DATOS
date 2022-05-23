package Application.entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
