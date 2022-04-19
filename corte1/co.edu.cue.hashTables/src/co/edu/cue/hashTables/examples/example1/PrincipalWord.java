package co.edu.cue.hashTables.examples.example1;

import java.util.Hashtable;

public class PrincipalWord {
    public static void main(String[] args) {
        Hashtable<Word, String> table = new Hashtable<Word, String>();

        Word word = new Word("Shark");

        table.put(word, "an animal");

        System.out.println(table.get(word));
        System.out.println("Remove an entry: " +table.remove(word));
    }
}
