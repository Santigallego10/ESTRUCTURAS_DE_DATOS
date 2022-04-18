package Examples.Example3;

import java.security.Key;
import java.util.Hashtable;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        Map<Integer, Book> map = new Hashtable<Integer, Book>();

        Book b1 = new Book(101, "Let us C","Pepito Perez","PBG",8);
        Book b2 = new Book(102, "Software History","Santiago G","Books And Stuff",9);
        Book b3 = new Book(103, "Book 3","Unknow","PGB",5);

        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        for(Map.Entry<Integer, Book> entry : map.entrySet()){
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details");
            System.out.println(b.toString());
        }


    }
}
