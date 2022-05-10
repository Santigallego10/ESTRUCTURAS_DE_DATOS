package co.edu.cue.genericsExamples.example2;

import co.edu.cue.genericsExamples.example1.Producto;

import java.util.Arrays;
import java.util.List;

public class Example2Main {
    public static void main(String[] args) {
        Producto[] productosArreglo = {
                new Producto(1015, "Celular", 50),
                new Producto(1016, "Smart Watch", 80),
                new Producto(1017, "Televisor", 300),
                new Producto(1018, "Laptop", 250)
        };
        Integer[] valoresOferta = {2, 4, 6, 8};
        String[] valoresStrings = {"Santiago", "Felipe", "Maria Fernanda"};

        List<Producto> productosLista = fromArrayToList(productosArreglo);
        List<Integer> enterosLista = fromArrayToList(valoresOferta);
        List<String> nombreOfertantes = fromArrayToList(valoresStrings, valoresOferta);

        productosLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);
        nombreOfertantes.forEach(System.out::println);
    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G element: x) {
            System.out.println(element);
        }
        return Arrays.asList(c);
    }
}
