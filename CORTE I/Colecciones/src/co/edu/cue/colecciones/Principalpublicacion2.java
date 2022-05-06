package co.edu.cue.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principalpublicacion2 {
    public static void main(String[] args) {
        List<Publicacion> publi = new ArrayList<>();
        publi.add(new Publicacion("Gafas","Dolce",100));
        publi.add(new Publicacion("Reloj","Tossot",150));
        publi.add(new Publicacion("Aretes","Tous",90));
        publi.add(new Publicacion("Bicicletas","Mountain",600));
        publi.add(new Publicacion("Zapatos","Velez",160));
        publi.add(new Publicacion("Camisas","Arturo calle",45));
        Collections.sort(publi);
        publi.forEach(System.out::println);





    }
}
