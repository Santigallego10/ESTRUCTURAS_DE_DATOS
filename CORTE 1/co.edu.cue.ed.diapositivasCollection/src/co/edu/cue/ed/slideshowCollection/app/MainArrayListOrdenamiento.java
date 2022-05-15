package co.edu.cue.ed.slideshowCollection.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import co.edu.cue.ed.slideshowCollection.model.Publicacion;

public class MainArrayListOrdenamiento {

	public static void main(String[] args) {
		List<Publicacion> publi = new ArrayList<>();
		publi.add(new Publicacion("Gafas", "Dolce", 100));
		publi.add(new Publicacion("Reloj", "Tossot", 150));
		publi.add(new Publicacion("Aretes", "Tous", 90));
		publi.add(new Publicacion("Bicicleta", "Mountain", 600));
		publi.add(new Publicacion("Zapatos", "Velez", 160));
		publi.add(new Publicacion("Camisa", "Arturo calle", 45));
		
		//publi.sort(comparing(Publicacion::getNombrePublicacion).reversed());
		
		publi.forEach(System.out::println);

	}

}