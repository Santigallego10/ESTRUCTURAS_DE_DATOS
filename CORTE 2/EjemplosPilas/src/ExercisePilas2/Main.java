package ExercisePilas2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("101 Truquitos para Speak",Identificador.IN);
        Book book2 = new Book("Fundamentos de programacion",Identificador.PR);
        Book book3 = new Book("Dracula",Identificador.TR);
        Book book4 = new Book("Libro de Matematicas",Identificador.MA);
        Book book5 = new Book("Desarrollo de bases de datos",Identificador.BD);
        Book book6 = new Book("Calculo",Identificador.MA);
        Book book7 = new Book("Misterio de Salem",Identificador.TR);
        Book book8 = new Book("Patrones de diseno",Identificador.PR);
        Book book9 = new Book("Aprende SQL",Identificador.BD);
        Book book10 = new Book("Porque todos saben ingles?",Identificador.IN);
        Book book11= new Book("Apocalipsis",Identificador.TR);
        Book book12 = new Book("Algoritmos",Identificador.PR);

        Stack<Book> books = new Stack<>();

        books.push(book);
        books.push(book2);
        books.push(book3);
        books.push(book4);
        books.push(book5);
        books.push(book6);
        books.push(book7);
        books.push(book8);
        books.push(book9);
        books.push(book10);
        books.push(book11);
        books.push(book12);

        List<Book> maList =  new ArrayList<>();
        List<Book> inList =  new ArrayList<>();
        List<Book> prList =  new ArrayList<>();
        List<Book> bdList =  new ArrayList<>();
        List<Book> trList =  new ArrayList<>();


        for (Book bb:books) {
            if(bb.getIdentificador() == Identificador.MA){
                maList.add(bb);
            }else if(bb.getIdentificador() == Identificador.IN){
                inList.add(bb);
            }else if(bb.getIdentificador() == Identificador.PR){
                prList.add(bb);
            }else if(bb.getIdentificador() == Identificador.BD){
                bdList.add(bb);
            }else{
                trList.add(bb);
            }
        }

        books.clear();
        llenar(maList, books);
        llenar(inList, books);
        llenar(prList, books);
        llenar(bdList, books);
        llenar(trList, books);


        for (Book bb:books) {
            System.out.println(bb.getName() +"---->"+ bb.getIdentificador()+", ");
        }

        Stack<Book> nuevo = invertir(books);
        System.out.println("---------------------------------");

        for (Book bb:nuevo) {
            System.out.println(bb.getName() +"---->"+ bb.getIdentificador()+", ");
        }
    }

    private static Stack<Book> invertir(Stack<Book> books) {
        Stack<Book> inverso = new Stack<>();
        for (int i = books.size()-1; i > -1; i--) {
            inverso.push(books.get(i));
        }

        return inverso;
    }

    public static void llenar(List<Book> list, Stack<Book> estanteria){
        for (Book b:list) {
            estanteria.push(b);
        }
    }
}
