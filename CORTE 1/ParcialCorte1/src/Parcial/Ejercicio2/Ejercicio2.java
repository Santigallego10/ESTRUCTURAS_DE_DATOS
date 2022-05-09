package Parcial.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {

       System.out.println(recursividad(1));

    }

    private static String recursividad(int n) {
        String cadena = "";
        for (int i = 0; i < n; i++) {
            cadena = cadena + "*";
        }
        cadena = cadena;
        if(n == 100){
            return cadena;
        }
        return cadena+ "\n"+recursividad(n+1);
    }
}
