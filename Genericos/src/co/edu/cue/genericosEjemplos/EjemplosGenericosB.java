package co.edu.cue.genericosEjemplos;

import java.util.LinkedList;
import java.util.List;

public class EjemplosGenericosB {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(8);
        Integer i = list.iterator().next();
        System.out.println();
    }
}
