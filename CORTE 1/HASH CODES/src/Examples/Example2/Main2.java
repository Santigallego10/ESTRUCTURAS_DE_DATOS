package Examples.Example2;

import java.util.Hashtable;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        hm.put(100, "Santi");
        hm.put(102,"Pedrito");

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(hm.getOrDefault(100, "Not found"));
        System.out.println(hm.getOrDefault(101, "Not found"));

    }
}
