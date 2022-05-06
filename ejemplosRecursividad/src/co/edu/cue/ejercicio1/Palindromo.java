package co.edu.cue.ejercicio1;

import java.util.Scanner;

public class Palindromo {




    public void  recursivoPalindromo(String cadenaPalabra){

        StringBuilder stringBuilder = new StringBuilder(cadenaPalabra);
       String invertidaCadenaPalabra = stringBuilder.reverse().toString();

       if (cadenaPalabra.equals(invertidaCadenaPalabra) ){
            System.out.println("Es una candena palindroma");
       }else{

           Scanner sc = new Scanner(System.in);
           System.out.println("No es una cadena palindroma, ingrese otra  cadena de palabras");
           String cadenaPalabra1 = sc.nextLine();
           recursivoPalindromo( cadenaPalabra1) ;


       }

    }










}
