package co.edu.cue.digiturno.application;

import co.edu.cue.digiturno.exceptions.PersonException;
import co.edu.cue.digiturno.model.Bank;
import co.edu.cue.digiturno.model.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        boolean flag = true;

        do {
            String option = readData("1. Asignar turno\n2. Consultar turno\n3. Ver turnos por cada tipo\n4. Salir");
            Person client;
            String id;
            System.out.print("\n\n");
            switch(option) {
                case "1":
                    id = readData("Ingrese el número de su cédula: ");
                    client = bank.searchClient(id, 0);

                    if (client != null) {
                        bank.setTurnNumber(client);
                    } else {
                        System.out.println("No existe un cliente con esta cédula en la base de datos");
                    }
                    System.out.print("\n\n");
                    break;
                case "2":
                    id = readData("Ingrese el número de su cédula: ");
                    String turn = bank.searchTurn(id, 0);

                    if (turn != null) {
                        System.out.println(turn);
                    } else {
                        System.out.println("Este cliente aun no tiene un turno asignado");
                    }
                    System.out.print("\n\n");
                    break;
                case "3":
                    bank.showTurnNumbers();
                    System.out.print("\n\n");
                    break;
                case "4":
                    flag = false;
                    System.out.print("\n\n");
                    break;
                default:
                    System.out.print("Opción no válida");
                    break;
            }
        } while (flag);
    }

    private static String readData(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

}