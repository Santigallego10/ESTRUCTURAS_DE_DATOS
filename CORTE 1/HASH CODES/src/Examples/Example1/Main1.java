package Examples.Example1;

import java.util.Hashtable;

public class Main1 {
    public static void main(String[] args) {
        Hashtable<Word, String> table = new Hashtable<>();

        Word word = new Word("dog");
        table.put(word, "An animal");

        System.out.println(table.get(word));

        System.out.println("Remove an entry: "+table.remove(word));
    }
}
