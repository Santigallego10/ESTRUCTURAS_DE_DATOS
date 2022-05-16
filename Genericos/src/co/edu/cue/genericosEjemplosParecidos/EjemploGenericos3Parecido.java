package co.edu.cue.genericosEjemplosParecidos;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericos3Parecido {

    public static void main(String[] args) {
        Integer[] valoresOferta = {8,9,3};
        List<Integer> enteroLista = fromArrayToList(valoresOferta);
        System.out.println(enteroLista);

    }
    public static <T extends  Number> List<T> fromArrayToList(T[] c) { return Arrays.asList(c);}


}
