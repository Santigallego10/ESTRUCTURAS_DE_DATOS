package co.edu.cue.parcial1.punto4.application;

import co.edu.cue.parcial1.punto4.model.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University u = new University();
        boolean flag = true;

        do {
            String option = stringInput("1. Asignar turno\n2. Estadisticas\n3. Salir");

            switch (option) {
                case "1":
                    u.asignTurn();
                    break;
                case "2":
                    u.getStats();
                    break;
                case "3":
                    flag = false;
                default:
                    System.out.println("Opción no válida");
            }
        } while(flag);
    }

    private static String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
