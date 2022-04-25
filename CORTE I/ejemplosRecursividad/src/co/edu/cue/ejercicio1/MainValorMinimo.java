package co.edu.cue.ejercicio1;

import java.util.Arrays;

public class MainValorMinimo {


    static int vMin(int numArray[], int i, int n){

        // Devuelve el primer elemento
        return (n == 1) ? numArray[i]:
                Math.min(numArray[i],vMin(numArray,i + 1, n - 1));

    }


    public static void main(String[] args) {

      int numArray[] = {7,32,64,2,10,23};
      System.out.println("Entrega el Array: " + Arrays.toString(numArray));
      int n = numArray.length;
      System.out.println("El minimo elemento del Array: " +vMin(numArray,0,n) + "\n");

    }
}
