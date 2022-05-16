package co.edu.cue.genericosEjemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static co.edu.cue.genericosEjemplos.EjemploGenericos2.fromArrayToList;
import static java.util.regex.Grapheme.T;

public class EjemploGenericos1_1 {  // Comprobaciones  de tipo mas  fuertes en tiempo de compilacion.
    public static void main(String[] args) {
        List<ProductoEjemplo1> productos = new ArrayList<>(); // eliminacion de casts
        productos.add(new ProductoEjemplo1( 1210, "Audifonos", 30));
        ProductoEjemplo1 productoOfertado = productos.iterator().next();
        System.out.println(productoOfertado);
        ProductoEjemplo1[] productosArreglo = {new ProductoEjemplo1(1015,"Canasta",50),
        new ProductoEjemplo1(1013, "uniforme",10)};
        Integer[] enterosArreglo = {1,5,8};
        List<ProductoEjemplo1> productosLista = fromArrayToList(productosArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);
        productosLista.forEach(System.out::println);

        public static <T> List<T> fromArrayToList(T[] c){
            return Arrays.asList(c);
        }


    }
}
