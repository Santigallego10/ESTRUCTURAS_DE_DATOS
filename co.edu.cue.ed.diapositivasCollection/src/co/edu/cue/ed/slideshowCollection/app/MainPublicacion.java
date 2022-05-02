package co.edu.cue.ed.slideshowCollection.app;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import co.edu.cue.ed.slideshowCollection.model.Publicacion;

public class MainPublicacion {

	public static void main(String[] args) {
		
		Set<Publicacion> publi = new TreeSet<>();
		publi.add(new Publicacion("Gafas", "Dolce", 100));
		publi.add(new Publicacion("Reloj", "Tossot", 150));
		publi.add(new Publicacion("Aretes", "Tous", 90));
		publi.add(new Publicacion("Bicicleta", "Mountain", 600));
		publi.add(new Publicacion("Zapatos", "Velez", 160));
		publi.add(new Publicacion("Camisa", "Arturo calle", 45));
		
		System.out.println(publi);
		
		
		//ITERADORES
		for (Publicacion a : publi) {
			System.out.println(a.getNombrePublicacion());
		}
		
		Iterator<Publicacion> it= publi.iterator();
		while (it.hasNext()) {
			Publicacion a= it.next();
			System.out.println(a.getNombrePublicacion());
		}
		
		publi.forEach(x->System.out.println(x));
		
		
		publi.forEach(System.out::println);
	}

}
