package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BookShelf {


        static Stack<Book>booksList = new Stack<>();
        static List<Book> codificationList = new ArrayList<>();
        static List<Book>terrorList = new ArrayList<>();
        static List<Book> englishList = new ArrayList<>();
        static List<Book> dataBaseList = new ArrayList<>();
        static List<Book> mathList = new ArrayList<>();

    public BookShelf(){
        Book book1= new Book(TypeOf.CODIFICATION, "Algoritmos" );
        Book book2 = new Book(TypeOf.TERROR, "Apocalipsis" );
        Book book3 = new Book(TypeOf.ENGLISH, "¿Por qué todoso saben inglés?" );
        Book book4 = new Book(TypeOf.DATABASE, "Aprende SQL" );
        Book book5 = new Book(TypeOf.CODIFICATION, "Patrones de diseño" );
        Book book6 = new Book(TypeOf.TERROR, "Misterio de Salem" );
        Book book7 = new Book(TypeOf.MATH, "Cálculo" );
        Book book8 = new Book(TypeOf.DATABASE, "Desarrollo de bases de datos" );
        Book book9 = new Book(TypeOf.MATH, "Libro de las matematicas" );
        Book book10 = new Book(TypeOf.TERROR, "Dracula" );
        Book book11 = new Book(TypeOf.CODIFICATION, "Fundamentos de programacion" );
        Book book12 = new Book(TypeOf.ENGLISH, "101 truquitos para speak" );

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        booksList.add(book9);
        booksList.add(book10);
        booksList.add(book11);
        booksList.add(book12);
        }

        public static void fillTheBookShelf()

    {
        for (Book b : booksList) {
            if (b.getTypeOf() == TypeOf.CODIFICATION) {
                codificationList.add(b);
            } else if (b.getTypeOf() == TypeOf.TERROR) {
                terrorList.add(b);
            } else if (b.getTypeOf() == TypeOf.ENGLISH) {
                englishList.add(b);
            } else if (b.getTypeOf() == TypeOf.DATABASE) {
                dataBaseList.add(b);

            }else if(b.getTypeOf() == TypeOf.MATH){
                mathList.add(b);
            }

        }
    }

       public static void showPila(){
            System.out.println(booksList);
           System.out.println(codificationList);
           System.out.println(terrorList);
           System.out.println(englishList);
           System.out.println(dataBaseList);
        }

    public static void reverseStack() {
        Stack<Book> reversedStack = new Stack<>();
        for (int i = booksList.size()-1; i >= 0; i--) {
            reversedStack.push(booksList.get(i));
        }
        System.out.println(reversedStack);
    }

    }

