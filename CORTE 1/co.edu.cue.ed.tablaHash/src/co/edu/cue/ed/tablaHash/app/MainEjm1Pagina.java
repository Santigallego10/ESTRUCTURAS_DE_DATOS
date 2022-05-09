package co.edu.cue.ed.tablaHash.app;

import java.util.Hashtable;

public class MainEjm1Pagina {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
		
		//mostrar si la tabla esta vacia
		boolean isEmpty= ht.isEmpty();
		System.out.println("In hash table empty: "+isEmpty);
		
		//agregar todo
		ht.put(1, "One"); //ht.size() is 1
		ht.put(2, "Two"); //ht.size() is 2
		ht.put(3, "Three"); //ht.size() is 3
		ht.put(4, "Four"); //ht.size() is 4
		ht.put(5, "Five"); //ht.size() is 5
		ht.put(6, "Six"); //ht.size() is 6
		ht.put(7, "Seven"); //ht.size() is 7
		
		//Imprimir todo
		System.out.println("Displayinh entries in hash table: "+ht);
		
		//tamaño de la tabla
		int size= ht.size();
		System.out.println("Size of hash table: "+size);
		
		//quitar entrada de la tabla
		String removeE= ht.remove(6);
		System.out.println("Removed entry: "+removeE);
		System.out.println("Update entries in hash table: "+ht);
		
		//mostrar valor de una clave especifica
		String getValue= ht.get(4);
		System.out.println("Getting the value of 4: "+getValue);
		System.out.println("Getting the value of 2: "+ht.get(2));
		
	}

}
