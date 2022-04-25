package tablaHash;

import java.util.Hashtable;

public class Ejercicios_2_2_4 {

    public static void main(String[] args) {

        Hashtable<Integer, String> h = new Hashtable<>();// Created Hashtable

        // Add mappings to hashtable
        h.put(1, "H");
        h.put(2, "A");
        h.put(3, "S");
        h.put(4, "H");
        h.put(5, "T");
        h.put(6, "A");
        h.put(7, "B");
        h.put(8, "L");
        h.put(9, "E");

        System.out.println(h);
        // clear hash table h
        h.clear();

        // checking whether hash table h is empty or not
        if (h.isEmpty())
            System.out.println("yes hash table is empty");

    }


}
