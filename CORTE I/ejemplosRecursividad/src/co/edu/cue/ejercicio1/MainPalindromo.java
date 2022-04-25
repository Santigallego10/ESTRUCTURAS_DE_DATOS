package co.edu.cue.ejercicio1;

import java.util.Scanner;

public class MainPalindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // entrada de una cadena
        System.out.println("Ingrese una cadena de palabras");
        String cadenaPalabra = sc.nextLine();

        Palindromo pl = new Palindromo();
        pl.recursivoPalindromo(cadenaPalabra);

    }

}
