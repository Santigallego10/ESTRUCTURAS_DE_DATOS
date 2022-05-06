package co.edu.cue.ejercicio1;

import java.util.Scanner;

public class NumerosNegativosPositivos {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el tamaño del arreglo:");
        int tamaño;
        tamaño = sc.nextInt();
        int arr[] = new int[tamaño];
        int i, j = 0;
        System.out.println("Escriba los elmentos del arreglo:");
        while (j < tamaño) {
            arr[j] = sc.nextInt();
            j++;
        }
        System.out.println("Los numeros positivos son :");
        for (i = 0; i < tamaño; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\nlos numeros negativos son:");
        for (i = 0; i < tamaño; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
















