package tablaHash;

import java.util.Hashtable;
import java.util.Set;

public class Ejercicios_2_2_5 {

    public static void main(String[] arg) // Java code illustrating entryset() method
    {
        // creating a hash table
        Hashtable<Integer, String> h =
                new Hashtable<Integer, String>();

        h.put(3, "C");
        h.put(2, "B");
        h.put(1, "A");

        // creating set view for hash table
        Set s = h.entrySet();

        // printing set entries
        System.out.println("set entries: " + s);
    }









}
