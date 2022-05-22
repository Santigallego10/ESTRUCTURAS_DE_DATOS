package co.edu.cue.tallerGrupal.application;

import co.edu.cue.tallerGrupal.model.Bank;
import co.edu.cue.tallerGrupal.model.Client;
import co.edu.cue.tallerGrupal.model.ClientTypes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(addClients());

      boolean flag=true;


        do {
            String option = stringInput(
                    "\n1. Asignar turno" +
                    "\n2. Ver estado de filas" +
                    "\n3. Salir"
            );

            switch (option) {
                case "1":
                    Client client= bank.obtenerClient();
                    bank.selectBox(client);
                    break;
                case "2":
                    bank.showQueueCash();
                    break;
                case "3":
                    flag=false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while(flag);
    }

    public static Queue<Client> addClients() {
        Queue<Client> queue = new LinkedList<>();
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


    private static String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
