package co.edu.cue.genericosEjemplosParecidos;

import co.edu.cue.genericosEjemplos.Oferta;
import co.edu.cue.genericosEjemplos.ProductoEjemplo1;

public class PrincipalOfertaParecida {

    public static <T> void imprimirOfertas(Oferta<T> subasta){
        for(T a:subasta){
            System.out.println((a.toString()));
        }
    }


    public static void main(String[] args) {
        Oferta<CarroEjemplo1Parecido> subasta = new Oferta<>(4);
        subasta.add(new CarroEjemplo1Parecido("Mazda",45000,400.0));
        subasta.add(new CarroEjemplo1Parecido("Kia",78000,100.0));
        subasta.add(new CarroEjemplo1Parecido("Chevy",90000,120.0));
        subasta.add(new CarroEjemplo1Parecido("Doge",14000,2000.0));
        subasta.add(new CarroDestacado<>("BMW",56000,2000.0,"Agotado"));
        imprimirOfertas(subasta);
    }






}
