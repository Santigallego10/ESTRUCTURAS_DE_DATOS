package co.edu.cue.genericosEjemplos;

import java.util.Arrays;
import java.util.List;

import static co.edu.cue.genericosEjemplos.EjemploGenericos2.fromArrayToList;
import static java.util.Arrays.asList;

public class EjemploGenericos3 {
    public static void main(String[] args) {
        Integer[] valoresOferta = {1,5,8};
        List<Integer> enteroLista = fromArrayToList(valoresOferta);
        System.out.println(enteroLista);

    }

    public static <T extends  Number> List<T> fromArrayToList(T[] c) { return Arrays.asList(c);}
}


