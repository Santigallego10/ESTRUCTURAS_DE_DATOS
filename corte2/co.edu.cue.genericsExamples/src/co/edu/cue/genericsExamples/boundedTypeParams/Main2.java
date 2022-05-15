package co.edu.cue.genericsExamples.boundedTypeParams;

import co.edu.cue.genericsExamples.example1.Producto;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Producto[] productoArreglo = {
                new Producto(1015, "Canasta", 500),
                new Producto(1013, "Uniforme", 10)
        };
        List<Producto> productosLista = fromArrayToList(productoArreglo);

        System.out.println("Productos generales");
        imprimirProductos(productosLista);
    }

    public static <T extends Producto> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static void imprimirProductos(List<? extends Producto> productos) {
        productos.forEach(System.out::println);
    }
}
