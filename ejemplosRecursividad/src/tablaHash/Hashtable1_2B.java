package tablaHash;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1_2B {

    public static void main(String[] args) {

        Hashtable<Integer,String> hm = new Hashtable<Integer, String>();

        hm.put(100, "Ana");
        hm.put(102, "Luis");
        hm.put(101, "Santiago");
        hm.put(103, "Mafe");

       System.out.println(hm.getOrDefault(100,"Not Found"));
       System.out.println(hm.getOrDefault(105,"Not Found"));
    }
}
