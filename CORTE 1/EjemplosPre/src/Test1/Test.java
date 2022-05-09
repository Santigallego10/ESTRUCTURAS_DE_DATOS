package Test1;

import java.util.HashMap;

//FUNCIONAMIENTO CON VALORES NULOS

public class Test {
    public static void main(String[] args) throws Exception {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put(null, null);
        hashMap.put(null, 5);
        hashMap.put ("Mafe", 7);
        hashMap.put("Santi", null);

        System.out.println(hashMap);
    }
}
