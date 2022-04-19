package co.edu.cue.ed.tablaHash.app;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class MainHashtableExEjm3 {

	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<>();

		  ht.put("John", 20); 
		  ht.put("Shubh", 30); 
		  ht.put("Peter", 25);
		  ht.put("Deep", 15); 
		  ht.put("Jonshan", 40);
		 
		System.out.println("Original entries of hash table: " +ht);

		// iterator-> recorrer tabla o lista
		//keySet-> devuelve lista de claves
		   System.out.println("Iterating keys of hash table:"); 
		   Iterator<String> itr = ht.keySet().iterator(); 
		   //mientras hay un elemento siguiente
		   while(itr.hasNext())  
		   {  
			   //imprima el siguiente elemento
		    System.out.println(itr.next());  
		   } 
		   //salto
		 System.out.println("\n");

		 
		System.out.println("Iterating values of hash table:");
		//obtiene lista de valores
		Iterator<Integer> itrValue = ht.values().iterator(); 
		//mientras hay un elemento siguiente
		while(itrValue.hasNext())  
		{  
			//imprima el siguiente elemento
		    System.out.println(itrValue.next());  
		} 
		//salto
		System.out.println("\n");
		System.out.println("Iterating entries of hash table:");

		//crea objeto Iterator de cada clave y valor de la tabla
		//obtiene todo y lo recorre
		Iterator<Entry<String, Integer>> itrEntry = ht.entrySet().iterator(); 
		while(itrEntry.hasNext())  
		{  
		    System.out.println(itrEntry.next());  
		} 
	}

}
