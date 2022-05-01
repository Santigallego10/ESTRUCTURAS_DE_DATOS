package co.edu.cue.auctionsTest.application;

import co.edu.cue.auctionsTest.model.AuctionsHouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AuctionsHouse house = new AuctionsHouse();

        boolean flag = true;

        do {
            String option = stringInput("1. Pujar por un producto\n2. Salir del programa");
             switch (option) {
                 case "1":
                     house.createAuction();
                     break;
                 case "2":
                     flag = false;
                     break;
                 default:
                     System.out.println("Opción no disponible");
             }
        } while(flag);
    }

    private static String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
