package co.edu.cue.genericosEjemplosParecidos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploGenericosAParecido {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Integer(8));
        Integer i = list.iterator().next(); // Sorprendentemente, el compilador emite un error.
                                            // No sabe que tipo de datos  se devuelve
        System.out.println(i);              // El compilador requerira una coversion explicita. Integer i = (Integer) list.iterator.next();
  }

}
