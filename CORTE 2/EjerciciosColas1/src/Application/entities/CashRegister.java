package Application.entities;

import java.util.LinkedList;
import java.util.Queue;

public class CashRegister {

    private int id;
    private Queue<Client> clientes;

    public CashRegister() {
    }

    public CashRegister(int id) {
        this.id = id;
        this.clientes = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Queue<Client> getClientes() {
        return clientes;
    }

    public void setClientes(Queue<Client> clientes) {
        this.clientes = clientes;
    }
}
