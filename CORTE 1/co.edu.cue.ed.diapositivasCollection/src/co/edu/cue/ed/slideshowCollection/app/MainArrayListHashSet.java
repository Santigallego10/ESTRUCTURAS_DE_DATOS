package co.edu.cue.ed.slideshowCollection.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainArrayListHashSet {

	public static void main(String[] args) {
		Set<String> hs= new HashSet<String>();
		hs.add("uno");
		hs.add("dos");
		hs.add("tres");
		hs.add("cuatro");
		hs.add("cinco");
		System.out.println("mostrar"+hs);
		
		List<String> lista= new ArrayList<>(hs);
		Collections.sort(lista);
	    System.out.println(lista);
	}

}