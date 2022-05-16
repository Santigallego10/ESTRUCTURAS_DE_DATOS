package co.edu.cue.genericosEjemplosParecidos;

import java.util.LinkedList;
import java.util.List;

public class EjemploGenericoBParecido {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        String i = list.iterator().next();
        System.out.println(i);
    }

}
