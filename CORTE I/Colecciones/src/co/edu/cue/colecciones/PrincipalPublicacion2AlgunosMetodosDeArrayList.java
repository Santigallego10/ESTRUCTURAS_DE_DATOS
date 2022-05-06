package co.edu.cue.colecciones;

import java.util.ArrayList;
import java.util.List;

public class PrincipalPublicacion2AlgunosMetodosDeArrayList {

    public static void main(String[] args) {
        List<Publicacion> publi = new ArrayList<>();
        System.out.println("Tamaño:  " + publi.size());
        System.out.println("es vacia:  " + publi.isEmpty());
        publi.add(new Publicacion("Gafas", "Dolce", 100));
        publi.add(new Publicacion("Reloj", "Tossot", 150));
        publi.add(new Publicacion("Aretes", "Tous", 90));
        publi.add(new Publicacion("Bicicletas", "Mountain", 600));
        publi.add(new Publicacion("Zapatos", "Velez", 160));
        // publi.add(new Publicacion("Camisas","Arturo calle",45));
        publi.set(2, new Publicacion("audifono", "xxx", 500));
        publi.forEach(System.out::println);
        System.out.println("-------------------");
        publi.remove(1);
        publi.forEach(System.out::println);


    }
}
