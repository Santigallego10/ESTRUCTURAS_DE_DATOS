package entities;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {

        Hashtable<Integer, String> hm = new Hashtable<Integer, String >();

        hm.put(100, "Ana");
        hm.put(102,"Luis");
        hm.put(101, "Santiago");
        hm.put(103, "mafe");

        //for(Map.Entry m : hm.entrySet()){ //para realizar las iteraciones
           // System.out.println(m.getKey()+" "+m.getValue());
        //}
        //System.out.println(hm.getOrDefault(101,"Not found"));
        //System.out.println(hm.getOrDefault(105, "Not found"));

        System.out.println("Initial map: " +hm);
        hm.putIfAbsent(104,"Arle");
        System.out.println("Updated map" +hm);
        hm.putIfAbsent(101,"pepe");
        System.out.println("Updated map: "+hm);
    }
}
