package co.edu.cue.genericosEjemplosParecidos;

import co.edu.cue.genericosEjemplos.ProductoEjemplo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static co.edu.cue.genericosEjemplos.EjemploGenericos2.fromArrayToList;


public class EjemploGenericos1_1Parecido {
    public static void main(String[] args) {
        List<CarroEjemplo1Parecido> carros = new ArrayList<>(); // eliminacion de casts
        carros.add(new CarroEjemplo1Parecido( "Mazda", 2000, 8000.0));
        CarroEjemplo1Parecido carroOfertado = carros.iterator().next();
        System.out.println(carroOfertado);
        CarroEjemplo1Parecido[] carrosArreglo = {new CarroEjemplo1Parecido("Chevrolet",4500,90000.0),
                new CarroEjemplo1Parecido("Kia", 6300,10000.0)};
        String[] stringsArreglo = {"amarillo","azul","rojo"};
        List<CarroEjemplo1Parecido> carrosLista = fromArrayToList(carrosArreglo);
        List<String>  stringLista = fromArrayToList(stringsArreglo);
        carrosLista.forEach(System.out::println);

        public static <T> List<T> fromArrayToList(T[] c){
            return Arrays.asList(c);
        }

    }


}
