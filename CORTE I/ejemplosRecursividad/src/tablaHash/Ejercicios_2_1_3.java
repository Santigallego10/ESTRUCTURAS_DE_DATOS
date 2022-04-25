package tablaHash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Ejercicios_2_1_3 {

    public static void main(String[] args)
    {
        Hashtable<String, Integer> personasEdades = new Hashtable<>(); // Usaremos el mismo ejemplo con los nombres de personas y sus edades

        personasEdades.put("Carlos", 21);
        personasEdades.put("Luis", 30);
        personasEdades.put("Mario", 25);
        personasEdades.put("Lina", 15);
        personasEdades.put("Juan", 40);

        System.out.println("Se imprime la tabla con nombres y edades: " +personasEdades);

// Se usara el metodo iterador para iterar las key .
        System.out.println("Iterando los nombres de la tabla:");
        Iterator<String> itr = personasEdades.keySet().iterator();
        while(itr.hasNext()) // Itera el siguiente nombre en la tabla.
        {
            System.out.println(itr.next()); // aqui imprime el siguiente nombre en la tabla.
        }
        System.out.println("\n");

        System.out.println("Itera las edades o valores de la tabla Hash:");
        Iterator<Integer> itrValue = personasEdades.values().iterator();
        while(itrValue.hasNext())
        {
            System.out.println(itrValue.next()); // imprime  el valor de la edad siguiente.
        }
        System.out.println("\n");
        System.out.println("Itera las entradas de nuevos nombres y edades:");

        Iterator<Map.Entry<String, Integer>> itrEntry = personasEdades.entrySet().iterator();
        while(itrEntry.hasNext()) // y va mostrando los siguientes nombres y edades que van entrando
        {
            System.out.println(itrEntry.next());
        }
    }
}












