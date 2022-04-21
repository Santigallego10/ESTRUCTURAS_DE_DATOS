package co.edu.cue.hashTables.exercises.exercise1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx {
    public static void main(String[] args) {
        Hashtable<String, Person> ht = new Hashtable<>();

        ht.put("Plat-1", new Person("Santiago", "Jaramillo", 19, "123456789"));
        ht.put("Plat-2", new Person("Felipe", "Jaramillo", 14, "987654321"));
        ht.put("Plat-3", new Person("Luis", "Gonzalez", 20, "987123645"));
        ht.put("Plat-4", new Person("Camila", "Ramirez", 31, "654357159"));
        ht.put("Plat-5", new Person("Ana", "Vega", 27, "159321457"));

        System.out.println("Original entries of hash table: " +ht);

        // Iterating elements of hash table using iterator() method.
        System.out.println("Iterating keys of hash table:");
        Iterator<String> itr = ht.keySet().iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n");

        System.out.println("Iterating values of hash table:");
        Iterator<Person> itrValue = ht.values().iterator();
        while(itrValue.hasNext()) {
            System.out.println(itrValue.next());
        }
        System.out.println("\n");

        System.out.println("Iterating entries of hash table:");

        Iterator<Map.Entry<String, Person>> itrEntry = ht.entrySet().iterator();
        while(itrEntry.hasNext()) {
            System.out.println(itrEntry.next());
        }
    }
}
