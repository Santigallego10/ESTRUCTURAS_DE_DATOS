package co.edu.cue.ed.slideshowCollection.app;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
		List<String> hs= new ArrayList<String>();
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
