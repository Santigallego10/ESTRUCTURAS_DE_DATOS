package co.edu.cue.genericosEjemplosParecidos;

import co.edu.cue.genericosEjemplos.ProductoEjemplo1;

import java.util.Arrays;
import java.util.List;

public class EjemploGenerico2Parecido {

    public static void main(String[] args) {
        CarroEjemplo1Parecido[] carrosArreglo = {new CarroEjemplo1Parecido("Mazda",52000,1400.0),
                new CarroEjemplo1Parecido("Kia",7400,1500.0)};
        Integer[] valoresOferta = {1,5,8};
        List<CarroEjemplo1Parecido> carrosLista = fromArrayToList(carrosArreglo);
        List<Integer> enterosLista = fromArrayToList(valoresOferta);
        carrosLista.forEach(System.out::println);


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
