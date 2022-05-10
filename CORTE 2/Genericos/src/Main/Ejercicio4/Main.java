package Main.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        T object1 = new T<>("Peter Pan",10,20000,Type.BOOK);
        T object2 = new T<>("Ferxxo",5,5000,Type.VIDEO);
        T object3 = new T<>("Revista Tu",13,9000,Type.MAGAZINE);

        List<T> objects = new ArrayList<>();
        objects.add(object1);
        objects.add(object2);
        objects.add(object3);

        for (T t:objects) {
            System.out.println(t.toString());
        }

    }
}
