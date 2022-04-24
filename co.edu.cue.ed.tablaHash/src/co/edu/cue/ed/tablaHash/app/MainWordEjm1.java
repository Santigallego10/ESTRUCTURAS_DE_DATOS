package co.edu.cue.ed.tablaHash.app;

import java.util.Hashtable;

import co.edu.cue.ed.tablaHash.model.WordEjm1;

public class MainWordEjm1 {

	public static void main(String[] args) {

		Hashtable<WordEjm1, String> table= new Hashtable<>();
		
		WordEjm1 word= new WordEjm1("cat");
		table.put(word, "an animal");
		
		System.out.println(table.get(word));
		System.out.println("remove an entry: "+table.remove(word));
		
		table.put(word, "an animal");
		System.out.println(table.get(word));
		System.out.println(word.getName());
	}
	
}
