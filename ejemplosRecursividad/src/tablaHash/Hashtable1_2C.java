package tablaHash;

import java.util.Hashtable;

public class Hashtable1_2C {

    public static void main(String[] args) {

        Hashtable<Integer,String> hm = new Hashtable<Integer, String>();

        hm.put(100, "Ana");
        hm.put(102, "Luis");
        hm.put(101, "Santiago");
        hm.put(103, "Mafe");

        System.out.println("Initial Map: "+  hm);
        // Inserts, as the specified pair is unique
        hm.putIfAbsent(104,"Arle");
        System.out.println("Updated Map: "+ hm);
        //Returns the current value, as the specified pair already exist
        hm.putIfAbsent(101,"pepe");
        System.out.println("Updated Map: "+ hm);
    }


}
