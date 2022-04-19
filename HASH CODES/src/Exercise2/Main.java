package Exercise2;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Hashtable<Integer, String> students = new Hashtable<>();

        students.put(1,"Bob Plop");
        students.put(2,"Mark Math");
        students.put(3,"Jess Lep");
        students.put(4,"Bar Crap");
        students.put(5,"Liss Plis");

        System.out.println("Initial table: ");
        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println(entry.toString());
        }

        students.replace(4,"Bar Replace");

        System.out.println("Table After replace: ");
        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println(entry.toString());
        }

        if (students.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista no esta vacia");
        }

        System.out.println("Quitamos a todos los estudiantes: ");

        students.remove(1);
        students.remove(2);
        students.remove(3);
        students.remove(4);
        students.remove(5);

        System.out.println("Table After removes: ");
        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println(entry.toString());
        }

        if (students.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista no esta vacia");
        }




    }
}
