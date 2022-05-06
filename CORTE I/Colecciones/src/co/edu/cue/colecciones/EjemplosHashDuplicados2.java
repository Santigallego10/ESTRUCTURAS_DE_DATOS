package co.edu.cue.colecciones;

import java.util.HashSet;
import java.util.Set;

public class EjemplosHashDuplicados2 {
    public static void main(String[] args) {
        String[] nombres = {"Arle", "Santiago", "Mafe","Maria", "Teresa", "Santiago"};
        Set<String> unicos  = new HashSet<>();
        Set<String> duplicados = new HashSet<>();


        for(String nombre : nombres){
            if(!unicos.add(nombre)){
                duplicados.add(nombre);

            }
        }
        unicos.removeAll(duplicados); // elimina duplicados
        System.out.println(unicos.size()  +   "  elementos unicos " + unicos);
        System.out.println(unicos.size()  + " elementos no duplicados  " + duplicados);

    }
}
