package cue.edu.co.ejerciciosRecursividad;

import java.util.Scanner;

public class RecursividadEjemplos {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


    }



    // Ejemplo 1

     public long sumaNenteros(int n){
         if (n == 1)
             return 1;
         else
             return n  + sumaNenteros(n-1);

     }


    // Ejemplo 2

    public int  printFibonacci(int n) {

        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return printFibonacci(n - 1) + printFibonacci(n - 2);
    }
    // Ejemplo 3

    public long  calcularFactorial(int n){

        if (n <= 1)
            return 1;
        else{
            long resultado = n * calcularFactorial(n-1);
            return resultado;
        }


    }

    // Ejemplo 4

    static void metodoA(char c){
        if(c > 'A')
            metodoB(c);
        System.out.print(c + "");
    }

    static void metodoB(char c){
        metodoA(--c);
    }

    // Ejemplo 5 revisar

    public void reverseString(String cadena){

        if ((cadena == null) || (cadena.length() <= 1))
            System.out.println(cadena);
        else{
            System.out.print(cadena.charAt(cadena.length() - 1));
            reverseString(cadena.substring(0,cadena.length() -1));
        }

    }













}
