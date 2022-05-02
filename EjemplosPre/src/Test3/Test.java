package Test3;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] argv) throws Exception
    {
        try {
            NavigableMap<Integer, String> treemap = new TreeMap<Integer, String>();
            treemap.put(1, "one");
            treemap.put(2, "two");
            treemap.put(3, "three");
            treemap.put(4, "four");
            treemap.put(5, "five");

            System.out.println("TreeMap: " + treemap);

            Comparator comp = treemap.comparator();

            //es null porque usamos su sort original
            System.out.println("Comparator value: " + comp);
        }
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }

}