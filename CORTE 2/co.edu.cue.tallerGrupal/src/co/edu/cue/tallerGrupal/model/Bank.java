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

    private void addToQueueRetiro(int num, Client client) {
        if (isPreferential(client)) {
            if (num == 1) {
                r1.getQueue().addFirst(client);
                assignTurn(r1,client);
            } else {
                r2.getQueue().addFirst(client);
                assignTurn(r2,client);
            }
        } else {
            if (num == 1) {
                r1.getQueue().addLast(client);
                assignTurn(r1,client);
            }
            else {
                r2.getQueue().addLast(client);
                assignTurn(r2, client);
            }
        }
    }

    public void assignTurn(CashRegister r, Client client) {
        if (r==r1){
            System.out.println("Your turn is: Cash 1-"+(r1.getQueue().indexOf(client)+1));
        } else if (r == r2) {
            System.out.println("Your turn is: Cash 2-"+(r2.getQueue().indexOf(client)+1));
        }else if (r == r3) {
            System.out.println("Your turn is: Cash 3-"+(r3.getQueue().indexOf(client)+1));
        }else if (r == r4) {
            System.out.println("Your turn is: Cash 4-"+(r4.getQueue().indexOf(client)+1));
        } else
        System.out.println("Your turn is: Cash 5-"+(r5.getQueue().indexOf(client)+1));
    }


    private void addToQueueDeposito(int num, Client client) {
        if (isPreferential(client)) {
            if (num == 3) {
                r3.getQueue().addFirst(client);
                assignTurn(r3,client);
            } else {
                r4.getQueue().addFirst(client);
                assignTurn(r4, client);
            }
        } else {
            if (num == 3) {
                r3.getQueue().addLast(client);
                assignTurn(r3,client);
            }
            else {
                r4.getQueue().addLast(client);
                assignTurn(r4, client);
            }
        }
    }

    private void addToQueueAsesoria(Client client) {
        if (isPreferential(client)) {
            r5.getQueue().addFirst(client);
            assignTurn(r5, client);
        } else {
            r5.getQueue().addLast(client);
            assignTurn(r5, client);
        }
    }


    public void selectBox(Client client) {
        String option = stringInput(
                "Seleccione el tipo de atención" +
                "\n1. Retiro" +
                "\n2. Deposito" +
                "\n3. Asesoría"
        );

        int queueNum;

        switch (option) {
            case "1":
                queueNum = searchShortestQueue(CashBoxType.RETIRO);
                addToQueueRetiro(queueNum,client);
                break;
            case "2":
                queueNum = searchShortestQueue(CashBoxType.DEPOSITO);
                addToQueueDeposito(queueNum,client);
                break;
            case "3":
                queueNum = searchShortestQueue(CashBoxType.ASESORIA);
                addToQueueAsesoria(client);
                break;
            default:
                System.out.println("Elija otra opción, no sea terco");
                break;
        }
    }

    public Client obtenerClient(){

        Queue<Client> queue = addClients();
        Client client= queue.peek();
        if (client != null) {
            queue.remove();
            System.out.println(client.toString());
            return client;
        } else
            return null;
    }
    static Queue<Client> queue = new LinkedList<>();

    public static Queue<Client> addClients() {
        queue.add(new Client("Mafe", "1234", ClientTypes.PREFERENCIAL));
        queue.add(new Client("Santi", "9876", ClientTypes.GENERAL));
        queue.add(new Client("Maria", "6543", ClientTypes.NO_CLIENT));
        queue.add(new Client("Alvaro", "7654", ClientTypes.GENERAL));
        queue.add(new Client("Arle", "2345", ClientTypes.NO_CLIENT));
        queue.add(new Client("Fernanda", "4567",ClientTypes.PREFERENCIAL));
        queue.add(new Client("Karol G", "7890", ClientTypes.GENERAL));
        queue.add(new Client("Valentina", "2468", ClientTypes.NO_CLIENT));
        return queue;
    }


    public void showQueueCash(){
        System.out.print("Cash 1: ");
        for (int i = 0; i < r1.getQueue().size(); i++) {
            System.out.print(" | ");
        }
        System.out.print("\nCash 2: ");
        for (int i = 0; i < r2.getQueue().size(); i++) {
            System.out.print(" | ");
        }
        System.out.print("\nCash 3: ");
        for (int i = 0; i < r3.getQueue().size(); i++) {
            System.out.print(" | ");
        }
        System.out.print("\nCash 4: ");
        for (int i = 0; i < r4.getQueue().size(); i++) {
            System.out.print(" | ");
        }
        System.out.print("\nCash 5: ");
        for (int i = 0; i < r5.getQueue().size(); i++) {
            System.out.print(" | ");
        }
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
