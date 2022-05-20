package exercise2.biblioteca.pilas;

import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Libreria libreria= new Libreria();

        libreria.organizeBooks();
        libreria.seeNewBookList();
        libreria.reverseList();
    }
}
