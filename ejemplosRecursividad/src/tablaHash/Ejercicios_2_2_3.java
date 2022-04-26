package tablaHash;

import java.util.Hashtable;

public class Ejercicios_2_2_3 {

    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();  // https://es.tutorialcup.com/java/hashtable-in-java.htm
        h.put(111,"Aditya");
        h.put(222, "Bharat");
        h.put(333, "Chetan");
        h.put(444, "Dev");
        h.put(555, "Harish");
        System.out.println(h);

        System.out.println("Check if hashtable contains Chetan: " + h.contains("Chetan"));
        System.out.println("Check if hashtable contains Jeeva: " + h.contains("Jeeva"));
        System.out.println("Check if hashtable contains the key 222: " + h.containsKey(222));
        System.out.println("Check if hashtable contains the key 123: " + h.containsKey(123));
        System.out.println("Check if hashtable contains Hari: " + h.containsValue("Hari"));
        System.out.println("Check if hashtable contains Aditya: " + h.containsValue("Aditya"));
        System.out.println("Get the value of key 444: " + h.get(444));
        System.out.println("Get the value of key 222: " + h.getOrDefault(222, "Test"));
        System.out.println("Get the value of key 123: " + h.getOrDefault(123, "Test"));



    }
}






