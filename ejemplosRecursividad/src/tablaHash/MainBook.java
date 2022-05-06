package tablaHash;

import java.awt.print.Book;
import java.util.Hashtable;
import java.util.Map;

public class MainBook {

    public static void main(String[] args) {

        //Creating map of books
        Map<Integer, Book> map = new Hashtable<Integer,Book>();
        //Creating Books
        Book b1=new Book(101,  "Let us C", "Yashwant Kanetkar", "BPB",8);
        Book b2=new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill",4);
        Book b3=new Book(103, "Operating System", "Galvin", "Wiley",6);
        //Adding Books to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Traversing map
        for(Map.Entry<Integer,Book> entry: map.entrySet()){
            int key= entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+"Details: ");
            System.out.println(b.id+" "+b.name+" "+b.autor+" "+b.publisher+" "+b.quantity);
        }
    }

}
