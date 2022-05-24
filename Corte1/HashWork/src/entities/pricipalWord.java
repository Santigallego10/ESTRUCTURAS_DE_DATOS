package entities;

import java.util.Hashtable;

public class pricipalWord {
    public static void main(String[] args) {

        Hashtable<Word,String>table = new Hashtable<>();

        Word word = new Word("cat");
        table.put(word, "an animal ");

        System.out.println(table.get(word));

        System.out.println("remove an entry: " + table.remove(word));
    }
}
