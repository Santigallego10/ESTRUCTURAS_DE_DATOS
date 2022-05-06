package co.edu.cue.colecciones;

import java.util.*;

public class EjemploHashSetAgregarComoParametroParaArrayList {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println("mostrar:  " + hs);


        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);
        System.out.println(lista);
    }

}
