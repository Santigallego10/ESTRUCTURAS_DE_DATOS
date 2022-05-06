package co.edu.cue.colecciones;



import java.util.Set;
import java.util.TreeSet;

public class Principalpublicacion {
    public static void main(String[] args) {
        Set<Publicacion> publi = new TreeSet<>();
        publi.add(new Publicacion("Gafas","Dolce",100));
        publi.add(new Publicacion("Reloj","Tossot",150));
        publi.add(new Publicacion("Aretes","Tous",90));
        publi.add(new Publicacion("Bicicletas","Mountain",600));
        publi.add(new Publicacion("Zapatos","Velez",160));
        publi.add(new Publicacion("Camisas","Arturo calle",45));
        System.out.println(publi);
    }
}

// Iteradores

/* for (Publicacion a : publi ){
    System.out.println(a.getNombrePublicacion());
    }

Iterator<Publicacion> it = publi.iterator();
while(it.hasNext()){
Publicacion a = it.next();
System.out.println(a.getNombrePublicacion());
}

publi.forEach(x -> System.out.println(x));

publi.forEach(System.out::println);


 */

