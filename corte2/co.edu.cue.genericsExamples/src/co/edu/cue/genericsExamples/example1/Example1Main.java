package co.edu.cue.genericsExamples.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1210, "Audifonos", 30));

        Producto productoOfertado = productos.iterator().next();
        System.out.println(productoOfertado);

        Producto[] productosArreglo = {
                new Producto(1015, "Celular", 50),
                new Producto(1016, "Smart Watch", 80),
                new Producto(1017, "Televisor", 300),
                new Producto(1018, "Laptop", 250)
        };
        Integer[] enterosArreglo = {1, 3, 5, 7, 9};

        List<Producto> productoLista = fromArrayToList(productosArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);
    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
}
