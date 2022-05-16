package co.edu.cue.genericosEjemplosParecidos;

import co.edu.cue.genericosEjemplos.ProductoEjemplo1;

import java.util.List;

import static co.edu.cue.genericosEjemplos.EjemploGenericos2.fromArrayToList;

public class EjemploGenerico5Parecido {
    public static void main(String[] args) {
        CarroEjemplo1Parecido[] carrosArreglo = {new CarroEjemplo1Parecido("Mazda",4000,8000.0),new CarroEjemplo1Parecido("Kia", 7800, 1000.0 )};
        List<CarroEjemplo1Parecido> carroLista = fromArrayToList(carrosArreglo);
        System.out.println("carros");
        imprimirCarros(carroLista);

        List<CarroDestacado> listaCarrosDestacado = fromArrayToList(new CarroDestacado[]{new CarroDestacado("BMW",50000,69000,"vendido")});
        System.out.println("Carros destacados");
        imprimirCarros(listaCarrosDestacado);

    }

    public static void  imprimirCarros(List<? extends  CarroEjemplo1Parecido> carros){
        carros.forEach(System.out::println);
    }







}
