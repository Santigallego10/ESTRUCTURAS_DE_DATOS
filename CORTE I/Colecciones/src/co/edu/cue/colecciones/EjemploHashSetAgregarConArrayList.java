package co.edu.cue.colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploHashSetAgregarConArrayList {

    public static void main(String[] args) {

        List<String> hs = new ArrayList<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println("mostrar:   " + hs);
        hs.add("tres");
        System.out.println("mostrar agregando: " + hs);
        boolean checkDuplicados = hs.add("cinco");
        System.out.println("permite elementos duplicados ->" + checkDuplicados);

    }

}
