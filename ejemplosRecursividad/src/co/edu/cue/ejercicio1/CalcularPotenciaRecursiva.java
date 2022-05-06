package co.edu.cue.ejercicio1;

import java.io.Console;

public class CalcularPotenciaRecursiva {

    public static void main(String[] args){

        int numero = Convert.ToInt32(Console.ReadLine());
        int exponente = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine(Potencia(numero,exponente)); // se escribe por consola el resultado del metodo potencia que contiene dos parametros numero y exponente.

    }



    public static int Potencia(int numero, int exponente){ // metodo

        if (exponente == 0) // si el exponente es igual a cero
        {
            return 1; // retorne 1
        }
        else // sino
        {
            return numero * Potencia(numero,exponente - 1); // mutiplique el valor que hay en la variable por el resultado del metodo potencia y al exponente se le resta 1.
        }

    }

}
