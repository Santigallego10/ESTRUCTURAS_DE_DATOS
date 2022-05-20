package co.edu.cue.ed.collections.list.arrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
		
		List<String> nombreArrayList = new ArrayList<String>();

		nombreArrayList.add("Elemento");
		nombreArrayList.add("Elemento 1");
		nombreArrayList.add("Elemento 2");
		nombreArrayList.add("Elemento");
		nombreArrayList.add("Elemento 3");
		nombreArrayList.add("Elemento 3");
		
		Iterator<String> nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}
		System.out.println("\n");
		
		
		System.out.println("Eliminamos los elementos de ArrayList que sean iguales a Elemento 3");
		nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			if(elemento.equals("Elemento 3"))
				nombreIterator.remove();	
		}
		System.out.println("\n");
		
		System.out.println("Imprimimos los elementos del ArrayList tras realizar las eliminaciones: ");
		nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}
		System.out.println("\n");
		
		
		int n=4;
		nombreArrayList.add(n, "Elemento 4");
		System.out.println("Tama�o: "+nombreArrayList.size());
		System.out.println("Elemento en posicion 1: "+nombreArrayList.get(1));
		System.out.println("Arreglo contiene Elemento? -- "+nombreArrayList.contains("Elemento"));
		System.out.println("Posicion primera vez que aparece Elemento: "+nombreArrayList.indexOf("Elemento"));
		System.out.println("Posicion ultima vez que aparece Elemento:"+nombreArrayList.lastIndexOf("Elemento"));
		System.out.println("elemento borrado: "+nombreArrayList.remove(1)); 
		System.out.println("Borra primer valor llamado Elemento --- "+nombreArrayList.remove("Elemento"));
		nombreArrayList.clear();
		System.out.println("La lista esta vacia? -- "+nombreArrayList.isEmpty());  
		ArrayList arrayListCopia = (ArrayList) ((ArrayList) nombreArrayList).clone();  
		arrayListCopia.add("Hola");
		System.out.println(arrayListCopia.get(0));
		
		// Pasa el ArrayList a un Array 
		Object[] array = nombreArrayList.toArray(); 
		
		
			
	}

}