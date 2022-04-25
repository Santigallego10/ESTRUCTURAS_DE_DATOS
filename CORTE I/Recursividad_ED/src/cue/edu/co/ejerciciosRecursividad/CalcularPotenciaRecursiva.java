package cue.edu.co.ejerciciosRecursividad;

public class CalcularPotenciaRecursiva {

    public static void Main(string[] args) {

        int numero = convert.ToInt32(consola.readLine());
        int exponente = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine(Potencia(numero, exponente));

    }


    public static int Potencia(int numero, int exponente) {

        if (exponente == 0) {
            return 1;
        } else {
            return numero * Potencia(numero, exponente - 1);


        }

    }
}