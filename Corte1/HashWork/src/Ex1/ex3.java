package Ex1;

import java.util.Hashtable;

public class ex3 {

    public static void main(String[] args) {


    Hashtable<String, Integer> ht = new Hashtable<>();

    //Top of movies
        ht.put("Girl interrupted",5);
        ht.put("closer",4);
        ht.put("el orfanato",3);
        ht.put("Belladonna of sadness",2);
        ht.put("Laberinto del fauno",1);

        System.out.println("Original entries of hash table: "+ht);

        Integer replace = ht.replace("el orfanato",6);
        System.out.println("Replacing entry for specific key: " +replace);
        System.out.println("update entrie:"+ht);

}
}
