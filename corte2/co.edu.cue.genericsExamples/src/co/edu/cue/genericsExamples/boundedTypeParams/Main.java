package co.edu.cue.genericsExamples.boundedTypeParams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] valoresOferta = {1, 3, 5};

        List<Integer> enterosLista = fromArrayToList(valoresOferta);
        System.out.println(enterosLista);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
}
