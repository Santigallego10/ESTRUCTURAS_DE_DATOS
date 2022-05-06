package tablaHash;

import java.util.Hashtable;

public class Ejercicios_2_1_1 {


    public static void main(String[] args)
    {
// Creamos una tabla Hash que tendra un ranking de paises.
        Hashtable<Integer, String> paises = new Hashtable<Integer, String>();

// Aqui verifica si la tabla esta vacia.
        boolean tablaVacia = paises.isEmpty();
        System.out.println("Esta la tabla vacia: " +tablaVacia);

// Agregamos los nombres de los paises y su ranking con el metodo put().
        paises.put(100, "Estados Unidos");
        paises.put(89, "Costa Rica");
        paises.put(71, "Argentina");
        paises.put(80, "Mexico");
        paises.put(20, "Alemania");
        paises.put(10, "Dinamarca");

        System.out.println("Despliegue la tabla Hash de paises con su ranking: " +paises);
        int tamaño = paises.size();
        System.out.println("Este es el tamaño de la tabla Hash: " +tamaño);

// Remover el ultimo pais.
        String remuevaDinamarca = paises.remove(6);
        System.out.println("Remueve Dinamarca: " +remuevaDinamarca);
        System.out.println("Se imprime tabla actualizada: " +paises);

// Extrae el pais  que esta en la posicion 4 de la tabla.
        String extraerPaisPosicionCuarto = paises.get(4);

        System.out.println("Getting the value of 4: " +extraerPaisPosicionCuarto);
        System.out.println("Getting the value of 2: " +paises.get(2)); // Otra forma de extraer elementos en una posicion, extrae Costa Rica y su ranking 89.
    }
}








