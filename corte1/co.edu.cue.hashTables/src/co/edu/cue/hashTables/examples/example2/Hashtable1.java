package co.edu.cue.hashTables.examples.example2;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm = new Hashtable<Integer,String>();

        hm.put(100, "Ana");
        hm.put(102, "Luis");
        hm.put(101, "Santiago");
        hm.put(103, "Mafe");

        for (Map.Entry m: hm.entrySet()) {
            System.out.println(m.getKey()+ " " +m.getValue());
        }

        System.out.println(hm.getOrDefault(101, "Not Found"));
        System.out.println(hm.getOrDefault(105, "Not Found"));
        System.out.println("----------------");
        System.out.println("Initial map: " +hm);
        hm.put(104, "Arle");
        System.out.println("Updated map 1: " +hm);
        hm.put(105, "Felipe");
        System.out.println("Updated map 2: " +hm);
    }
}