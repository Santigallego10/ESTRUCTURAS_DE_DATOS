package co.edu.cue.tallerGrupal.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bank {
    Queue<Client> entranceQueue = new LinkedList<>();
    CashRegister r1 = new CashRegister(CashBoxType.RETIRO);
    CashRegister r2 = new CashRegister(CashBoxType.RETIRO);
    CashRegister r3 = new CashRegister(CashBoxType.DEPOSITO);
    CashRegister r4 = new CashRegister(CashBoxType.DEPOSITO);
    CashRegister r5 = new CashRegister(CashBoxType.ASESORIA);

    public Bank() {
    }

    public Bank(Queue<Client> entranceQueue) {
        this.entranceQueue = entranceQueue;
    }

    public int searchShortestQueue(CashBoxType type) {
        if (type == CashBoxType.RETIRO) {
            if (r1.getQueue().size() > r2.getQueue().size()) return 2;
            else return 1;
        }
        else if (type == CashBoxType.DEPOSITO) {
            if (r3.getQueue().size() > r4.getQueue().size()) return 4;
            else return 3;
        }
        else return 5;
    }

    private boolean isPreferential(Client client) {
        if (client.getType() == ClientTypes.PREFERENCIAL) return true;
        return false;
    }

    private void addToQueue(int num) {

    }

    public void selectBox(Client client) {
        String option = stringInput(
                "Seleccione el tipo de atención" +
                "1. Retiro" +
                "\n2. Deposito" +
                "\n3. Asesoría"
        );

        int queueNum;

        switch (option) {
            case "1":
                queueNum = searchShortestQueue(CashBoxType.RETIRO);

                if (isPreferential(client)) {
                    if (queueNum == 1) r1.getQueue().addFirst(client);
                    else r2.getQueue().addFirst(client);
                } else {
                    if (queueNum == 1) r1.getQueue().addLast(client);
                    else r2.getQueue().addLast(client);
                }
                break;
            case "2":
                queueNum = searchShortestQueue(CashBoxType.DEPOSITO);

                if (isPreferential(client)) {
                    if (queueNum == 3) r3.getQueue().addFirst(client);
                    else r4.getQueue().addFirst(client);
                } else {
                    if (queueNum == 3) r3.getQueue().addLast(client);
                    else r4.getQueue().addLast(client);
                }
                break;
            case "3":
                queueNum = searchShortestQueue(CashBoxType.ASESORIA);

                if (isPreferential(client)) r5.getQueue().addFirst(client);
                else r5.getQueue().addLast(client);
                break;
            default:
                System.out.println("Elija otra opción, no sea terco");
                break;
        }
    }

    public void assignTurn() {

    }



    public Queue<Client> getEntranceQueue() {
        return entranceQueue;
    }

    public void setEntranceQueue(Queue<Client> entranceQueue) {
        this.entranceQueue = entranceQueue;
    }

    private static String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
