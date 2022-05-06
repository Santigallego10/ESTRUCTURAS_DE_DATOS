package co.edu.cue.colecciones;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println("mostrar: " + hs);
        hs.add("tres");
        System.out.println("mostrar agregado:  " + hs);
        boolean checkDuplicados = hs.add("cinco");
        System.out.println("permite elementos  duplicados ->" + checkDuplicados);




    }





}
