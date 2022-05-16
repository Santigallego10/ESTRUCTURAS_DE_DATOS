package co.edu.cue.genericosEjemplos;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericos2 {
    public static void main(String[] args) {
        ProductoEjemplo1[] productosArreglo = {new ProductoEjemplo1(1015,"Canasta",50),
        new ProductoEjemplo1(1013,"uniforme",10)};
        Integer[] valoresOferta = {1,5,8};
        List<ProductoEjemplo1> productoLista = fromArrayToList(productosArreglo);
        List<Integer> enterosLista = fromArrayToList(valoresOferta);
        productoLista.forEach(System.out::println);


        List<String>  nombreOfertantes = fromArrayToList(new String[]{ "Andres", "Santiago", "Mafe"}, valoresOferta);
    }

    public static <T> List<T> fromArrayToList(T[] c) { return Arrays.asList(c);}
    public  static <T,G> List<T> fromArrayToList(T[] c, G[] x) {
        for(G elemento : x ){
            System.out.println(elemento);
        }
        return  Arrays.asList(c);
    }
}
