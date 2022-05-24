package Ex1;

import java.util.Hashtable;

public class Ex1 {
    public static void main(String[] args) {


    Hashtable<Integer, String>ht = new Hashtable<Integer, String >();
    boolean isEmpty = ht.isEmpty();
    System.out.println("is hash table empty: "+isEmpty);

    ht.put(1, "Monday");
    ht.put(2, "Tuesday");
    ht.put(3, "wednesday");
    ht.put(4,"Thursday");
    ht.put(5, "Friday");
    ht.put(6, "Saturday");
    ht.put(7, "sunday");

    System.out.println("Displaying entries in hash table"+ht);
    int size= ht.size();
    System.out.println("size of hash table:"+size);

    String removeE = ht.remove(7);
    System.out.println("removed entry: " + removeE);
    System.out.println("update entries in hash table " +ht);

    String getValue = ht.get(5);
    System.out.println("getting the value of 5:" +getValue);
    System.out.println("Getting the value of 2:" +ht.get(2));
}
}