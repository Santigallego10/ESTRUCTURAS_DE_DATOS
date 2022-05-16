package co.edu.cue.genericosEjemplos;

import java.util.LinkedList;
import java.util.List;

public class EjemplosGenericosA {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(new Integer(1));
      //  Integer i = list.iterator().next(); //n  el compilador emite un error.
        System.out.println();
    }
}
 // el compilador requerira una compilacion explicita : Integer i = (Integer) list.iterator.next();
