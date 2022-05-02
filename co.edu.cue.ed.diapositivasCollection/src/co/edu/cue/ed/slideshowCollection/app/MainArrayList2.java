package co.edu.cue.ed.slideshowCollection.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import co.edu.cue.ed.slideshowCollection.model.Publicacion;

public class MainArrayList2 {

	public static void main(String[] args) {
		List<Publicacion> publi = new ArrayList<>();
		publi.add(new Publicacion("Gafas", "Dolce", 100));
		publi.add(new Publicacion("Reloj", "Tossot", 150));
		publi.add(new Publicacion("Aretes", "Tous", 90));
		publi.add(new Publicacion("Bicicleta", "Mountain", 600));
		publi.add(new Publicacion("Zapatos", "Velez", 160));
		publi.add(new Publicacion("Camisa", "Arturo calle", 45));
		Collections.sort(publi);
		publi.forEach(System.out::println);
	}

}
