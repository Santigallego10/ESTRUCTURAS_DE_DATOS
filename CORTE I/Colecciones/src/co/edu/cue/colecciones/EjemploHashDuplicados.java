package co.edu.cue.colecciones;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashDuplicados {

    public static void main(String[] args) {
        String[] nombres  = {"Arle", "Santiago", "Santiago", "Maria", "Teresa"};
        Set<String> unicos = new HashSet<>();

        for(String nombre : nombres) {
            if (!unicos.add(nombre)){
                System.out.println(("el elemento duplicado es -> "  + nombre));

            }
        }
        System.out.println(unicos.size() + " elementos no duplicados " + unicos);

    }
}
