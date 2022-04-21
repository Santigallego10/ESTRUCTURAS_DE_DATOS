package co.edu.cue.hashTables.exercises.exercise2;

import java.util.Hashtable;
import java.util.Map;

public class MainEx2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> books = new Hashtable<>();

        books.put(10, "Cien años de soledad");
        books.put(40, "Robinson Crusoe");
        books.put(50, "La divina comedia");
        books.put(30, "Más allá de la noche");
        books.put(20, "El palacio enmascarado");

        if (books.isEmpty()){
            System.out.println("No hay registros en la tabla");
        }else{
            System.out.println("Tabla inicial: ");
            for(Map.Entry<Integer, String> entry : books.entrySet()){
                System.out.println(entry.toString());
            }

            books.replace(30,"El principito");

            System.out.println("Tabla después del reemplazo: ");
            for(Map.Entry<Integer, String> entry : books.entrySet()){
                System.out.println(entry.toString());
            }

            books.remove(10);
            books.remove(20);

            System.out.println("Tabla después de eliminar algunos registros: ");
            for(Map.Entry<Integer, String> entry : books.entrySet()){
                System.out.println(entry.toString());
            }
        }



    }
}
