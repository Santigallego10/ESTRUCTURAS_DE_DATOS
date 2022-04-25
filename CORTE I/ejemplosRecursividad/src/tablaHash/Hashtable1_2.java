package tablaHash;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1_2 {

    public static void main(String[] args) {

        Hashtable<Integer,String> hm = new Hashtable<Integer, String>();

        hm.put(100, "Ana");
        hm.put(102, "Luis");
        hm.put(101, "Santiago");
        hm.put(103, "Mafe");

     for (Map.Entry m : hm.entrySet()){
         System.out.println(m.getKey() + " " + m.getValue());

       }

    }
}
