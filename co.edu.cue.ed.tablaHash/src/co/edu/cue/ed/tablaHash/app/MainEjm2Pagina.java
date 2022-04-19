package co.edu.cue.ed.tablaHash.app;

import java.util.Hashtable;

public class MainEjm2Pagina {

	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<>();

		  ht.put("John", 20); 
		  ht.put("Shubh", 30); 
		  ht.put("Peter", 25);
		  ht.put("Deep", 15); 
		  ht.put("Jonshan", 40);
		 //imprimo
		System.out.println("Original entries of hash table: " +ht);
	
		
		//reemplazar valor de una clave
		Integer replace = ht.replace("Peter", 60);
		System.out.println("Replacing entry for specified key: " +replace);
		System.out.println("Updated entries in hash table: " +ht);
		
		//verificar si hay una clave especifica (true or false)
		boolean containsKey = ht.containsKey("Shubh");
		System.out.println("Is key Shubh in hash table: " +containsKey);
		
		//verificar si hay un valor especifico (true or false)
		boolean containsValue = ht.containsValue(460);
		System.out.println("Is value 460 in hash table: " +containsValue);
	}

}
