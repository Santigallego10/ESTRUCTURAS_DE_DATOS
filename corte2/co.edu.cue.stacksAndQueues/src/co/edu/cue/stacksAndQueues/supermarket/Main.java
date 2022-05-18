package co.edu.cue.stacksAndQueues.supermarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Supermarket market = new Supermarket();
        boolean flag = true;

        do {
            String option = stringInput(
                    "1. Ingresar a la tienda\n" +
                    "2. Hacer fila\n" +
                    "3. Pagar\n" +
                    "v -> Ver estado de las filas\n" +
                    "e -> Salir del programa"
            );

            switch (option) {
                case "1":
                    market.getKart();
                    break;
                case "2":
                    market.goToQueue();
                    break;
                case "3":
                    market.checkoutFromQueue();
                    break;
                case "v":
                    market.showQueues();
                    break;
                case "e":
                    flag = false;
                    break;
            }
        } while(flag);
    }

    private static String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
