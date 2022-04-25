package cue.edu.co.ejerciciosRecursividad;

import java.util.Scanner;

public class Recursividad {




        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = sc.nextLine();



    int numArray1[]  ={7,-32,64,2,10,-23};



    }

    public String palabraPalidromo( String palabra ) {

        // Crear un StringBuilder a partir de la cadena
        StringBuilder stringBuilder = new StringBuilder(palabra);
        // Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
        String palabraR = stringBuilder.reverse().toString();

        if (palabra == palabraR) {
            System.out.println("Es una palabra palindroma");
        }

        return palabraPalidromo(palabra);

    }

    public int encuentraElValorMinimo(int numArray){

        int numArreglo[]  ={7,32,64,2,10,23};

         int aux ;


        for ( int i =0; i < 6; i++){
            if(numArreglo[i]< numArreglo[i+1]){
                numArreglo[i+1] = numArreglo[i];
                aux = numArreglo [i+1];

            }


            }

        }

    }


    public  int positivosNegativosArreglo(numArray1){


    for (int i=0; i < numArray1.length; i++){
        if ( numArray1[i] < 0){
            System.out.println("El numero positivo es:" + numArray1[i]+);

        }

    }






}
