package co.edu.cue.ed.slideshowCollection.app;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {

	public static void main(String[] args) {

		Set<String> hs= new HashSet<String>();
		hs.add("uno");
		hs.add("dos");
		hs.add("tres");
		hs.add("cuatro");
		hs.add("cinco");
		System.out.println("mostrar"+hs);
		hs.add("tres");
		System.out.println("mostrar agregando: "+hs);
		boolean checkDuplicates= hs.add("cinco");
		System.out.println("�permite elementos duplicados?: "+checkDuplicates);
		
	}

}
