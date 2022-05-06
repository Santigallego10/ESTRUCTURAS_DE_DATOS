package tablaHash;

import java.util.Hashtable;
import java.util.Map;

public class Ejercicios_2_2_1 {
    public static void main(String[] args)
    {  // https://es.acervolima.com/metodo-hashtable-compute-en-java-con-ejemplos/

        // create a table and add some values
        Map<String, Integer> table = new Hashtable<>();
        table.put("Pen", 10);
        table.put("Book", 500);
        table.put("Clothes", 400);
        table.put("Mobile", 5000);

        // print map details
        System.out.println("hashTable: " + table.toString());

        // remap the values of hashTable
        // using compute method
        table.compute("Pen", (key, val)
                -> val + 15);
        table.compute("Clothes", (key, val)
                -> val - 120);

        // print new mapping
        System.out.println("new hashTable: " + table);
    }
}






