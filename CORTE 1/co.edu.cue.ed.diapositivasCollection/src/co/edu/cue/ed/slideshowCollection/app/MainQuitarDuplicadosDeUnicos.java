package co.edu.cue.ed.slideshowCollection.app;

import java.util.HashSet;
import java.util.Set;

public class MainQuitarDuplicadosDeUnicos {

	public static void main(String[] args) {
		
		String [] nombres= {"Arle", "Santiago", "Maria", "Teresa", "Santiago"};
		Set<String> unicos= new HashSet<>();
		Set<String> duplicados= new HashSet<>();
		
		for (String nombre : nombres) {
			if (!unicos.add(nombre)) {
				duplicados.add(nombre);
			}
		}
		unicos.removeAll(duplicados);
		System.out.println(unicos.size()+" elementos unicos "+unicos);
		System.out.println(unicos.size()+" elementos duplicados "+duplicados);
	
	}

}
