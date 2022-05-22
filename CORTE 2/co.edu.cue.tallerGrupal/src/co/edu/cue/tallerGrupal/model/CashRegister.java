package co.edu.cue.tallerGrupal.model;

import java.util.LinkedList;

public class CashRegister {
    private LinkedList<Client> queue = new LinkedList<>();
    private CashBoxType type;

    public CashRegister(CashBoxType type) {
        this.type = type;
    }

    public LinkedList<Client> getQueue() {
        return queue;
    }

    public void setQueue(LinkedList<Client> queue) {
        this.queue = queue;
    }

    public CashBoxType getType() {
        return type;
    }

    public void setType(CashBoxType type) {
        this.type = type;
    }
}
