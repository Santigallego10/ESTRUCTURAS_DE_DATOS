package co.edu.cue.ed.slideshowCollection.app;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {

	public static void main(String[] args) {

		Set<String> ts= new TreeSet<>();
		ts.add("Rosa");
		ts.add("Juan");
		ts.add("Luisa");
		ts.add("Natalia");
		ts.add("Ana");
		ts.add("Rosa");
		
		System.out.println("mostrar: "+ts);
		
		
	}

}