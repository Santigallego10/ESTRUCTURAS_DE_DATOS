package exercise2.biblioteca.pilas;

import java.util.Stack;

public class Libreria {


    Stack<Book> books = new Stack<Book>();
    Stack<Book> newBookList = new Stack<Book>();


    public Libreria() {
        this.addBooks();
    }

    public void addBooks(){
            books.add(new Book(BookType.MA, "Contar las matematicas"));
            books.add(new Book(BookType.IN, "101 truquitos para Speak"));
            books.add(new Book(BookType.PR, "Fundamentos de la programacion"));
            books.add(new Book(BookType.TR, "Dracula"));
            books.add(new Book(BookType.MA, "Libro de las matematicas"));
            books.add(new Book(BookType.BD, "Desarrollo de bases de datos"));
            books.add(new Book(BookType.MA, "Calculo"));
            books.add(new Book(BookType.TR, "Misterio de Salem"));
            books.add(new Book(BookType.PR, "Patrones de diseño"));
            books.add(new Book(BookType.BD, "Aprende SQL"));
            books.add(new Book(BookType.IN, "¿Porque todos saben ingles?"));
            books.add(new Book(BookType.TR, "Apocalipsis"));
            books.add(new Book(BookType.PR, "Algoritmos"));
        }

        public void organizeBooks(){
            for (Book book: books) {
                if (book.getBookType()==BookType.MA) {
                    newBookList.add(book);
                }
            }
            for (Book book: books) {
                if (book.getBookType()==BookType.IN) {
                    newBookList.add(book);
                }
            }
            for (Book book: books) {
                if (book.getBookType()==BookType.PR) {
                    newBookList.add(book);
                }
            }
            for (Book book: books) {
                if (book.getBookType()==BookType.BD) {
                    newBookList.add(book);
                }
            }
            for (Book book: books) {
                if (book.getBookType()==BookType.TR) {
                    newBookList.add(book);
                }
            }
        }

        public void seeNewBookList(){
            for (int i = 0; i < newBookList.size(); i++) {
                System.out.println(newBookList.get(i));
            }
        }

        public void reverseList(){
            for (int i = newBookList.size()-1; i >0; i--) {
                System.out.println("Rever ---- "+newBookList.get(i));
            }
        }

    public Stack<Book> getBooks() {
        return books;
    }

    public void setBooks(Stack<Book> books) {
        this.books = books;
    }

    public Stack<Book> getNewBookList() {
        return newBookList;
    }

    public void setNewBookList(Stack<Book> newBookList) {
        this.newBookList = newBookList;
    }
}
