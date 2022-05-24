package Ex1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        //Top of movies
        ht.put("Girl interrupted",5);
        ht.put("closer",4);
        ht.put("el orfanato",3 );
        ht.put("Belladonna of sadness",2);
        ht.put("Laberinto del fauno",1);

        System.out.println("Original entries of hash table: " +ht);

        //Iterando elementos con el proposito de usar el metodo iterador

        System.out.println("iterating movies or just the keys: ");
        Iterator<String> itr = ht.keySet().iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n");
        System.out.println("iterating entries of hash table: ");

        Iterator<Map.Entry<String, Integer>>itrEntry = ht.entrySet().iterator();

        while(itrEntry.hasNext())
        {
            System.out.println(itrEntry.next());
        }

    }

    }

