package co.edu.cue.ed.slideshowCollection.app;

import java.util.HashSet;
import java.util.Set;

public class MainDeteccionDuplicados {

	public static void main(String[] args) {

		String [] nombres= {"Arle", "Santiago", "Santiago", "Maria", "Teresa"};
		Set<String> unicos= new HashSet<>();
		
		for (String nombre : nombres) {
			if (!unicos.add(nombre)) {
				System.out.println("el elemento duplicado es: "+nombre);
			}
		}
		
		System.out.println(unicos.size()+" elementos no duplicados "+unicos);
	
	}

}
