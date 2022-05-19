package co.edu.cue.stacksAndQueues.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Library {
    List<Book> books = new ArrayList<>();
    Stack<Book> booksStack = new Stack<>();
    BookId[] stackOrder = {BookId.TR, BookId.BD, BookId.PR, BookId.IN, BookId.MA};

    public Library() {
        books.add(new Book("Contar las matemáticas", BookId.MA));
        books.add(new Book("101 truquitos para Speak", BookId.IN));
        books.add(new Book("Fundamentos de programación", BookId.PR));
        books.add(new Book("Drácula", BookId.TR));
        books.add(new Book("Libro de las matemáticas", BookId.MA));
        books.add(new Book("Desarrollo de bases de datos", BookId.BD));
        books.add(new Book("Cálculo", BookId.MA));
        books.add(new Book("Misterios de Salem", BookId.TR));
        books.add(new Book("Patrones de diseño", BookId.PR));
        books.add(new Book("Aprende SQL", BookId.BD));
        books.add(new Book("¿Por qué todos saben inglés?", BookId.IN));
        books.add(new Book("Apocalipsis", BookId.TR));
        books.add(new Book("Algoritmos", BookId.PR));
    }

    public void fillStackOfBooks() {
        for (BookId id: stackOrder)
            for (Book book: books)
                if (book.getId() == id) booksStack.push(book);
    }

    public void showStack() {
        System.out.println(booksStack);
    }

    public void reverseStack() {
        Stack<Book> reversedStack = new Stack<>();
        for (int i = booksStack.size()-1; i >= 0; i--) {
            reversedStack.push(booksStack.get(i));
        }
        System.out.println(reversedStack);
    }



}
