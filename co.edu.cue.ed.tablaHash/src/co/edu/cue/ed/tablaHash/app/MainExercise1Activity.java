package co.edu.cue.ed.tablaHash.app;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import co.edu.cue.ed.tablaHash.model.MusicExercise1;

public class MainExercise1Activity {

	public static void main(String[] args) {

		Hashtable<Integer, MusicExercise1> table1= new Hashtable<Integer, MusicExercise1>();
		
		MusicExercise1 m1= new MusicExercise1("MAMI","Urbano Latino", "Karol G, Becky G", 2022, 04, "MAMIII");
		MusicExercise1 m2= new MusicExercise1("Tacones Rojos","Urbano latino, Pop", " John Legend, Sebastián Yatra", 2022, 03, "Tacones Rojos");
		MusicExercise1 m3= new MusicExercise1("12x3","Urbano Latino", "Dekko", 2021, 12, "12x3");
		MusicExercise1 m4= new MusicExercise1("Fuera del Mercado","Urbano Latino", "Danny Ocean", 2022, 02, "@dannocean");
		
		//PUT
		table1.put(1, m1);
		table1.put(2, m2);
		table1.put(3, m3);
		table1.put(4, m4);
		
		//SIZE
		System.out.println("Size of the hash table: "+ table1.size());
		System.out.println("\n");
		
		//REMOVE
		MusicExercise1 remove= table1.remove(3);
		System.out.println("Remove element 3: ");
		System.out.println(remove.getName()+" - "+remove.getGender()+" - "+remove.getSinger()+" - "+remove.getYearPublic()+" - "+remove.getMothPublic()+" - "+remove.getAlbum());
		System.out.println("\n");
		
		//IMPRIMIR TABLA
		System.out.println("New hash table: ");
		for (Map.Entry<Integer, MusicExercise1> entry : table1.entrySet()) {
			int key= entry.getKey();
			MusicExercise1 m= entry.getValue();
			System.out.println(key+ " Details ");
			System.out.println(m.getName()+" - "+m.getGender()+" - "+m.getSinger()+" - "+m.getYearPublic()+" - "+m.getMothPublic()+" - "+m.getAlbum());
		}
		System.out.println("\n");
		
		//GET
		MusicExercise1 mE= table1.get(2);
		System.out.println("Song with key=2: "+mE.getName()+" - "+mE.getGender()+" - "+mE.getSinger()+" - "+mE.getYearPublic()+" - "+mE.getMothPublic()+" - "+mE.getAlbum());
		System.out.println("\n");
		
		//add new objects
		table1.put(5, m3);
		table1.put(3, m1);
		
		//replace
		MusicExercise1 newM= new MusicExercise1("Permission to dance", "Kpop, Pop", "BTS", 2021, 07, " Permission to Dance (R&B Remix)");
		MusicExercise1 replace= table1.replace(1, newM);
		System.out.println("New hash table with updated: ");
		for (Map.Entry<Integer, MusicExercise1> entry : table1.entrySet()) {
			int key= entry.getKey();
			MusicExercise1 m= entry.getValue();
			System.out.println(key+ " Details ");
			System.out.println(m.getName()+" - "+m.getGender()+" - "+m.getSinger()+" - "+m.getYearPublic()+" - "+m.getMothPublic()+" - "+m.getAlbum());
		}
		System.out.println("\n");
		
		//containsKey
		boolean includesKey= table1.containsKey(5);
		System.out.println("In the hash table there is the key 5: "+includesKey);
		System.out.println("\n");
		
		//containsValue
		boolean includesValue= table1.containsValue(m2);
		System.out.println("In the hash table there is the value m3: "+includesValue);
		System.out.println("\n");
		
		
	
		//METODOS EJERCICIO 2
		
		//CLONE()
		table1.remove(3);
		Hashtable<Integer, MusicExercise1> tableClone=(Hashtable<Integer, MusicExercise1>) table1.clone();
		System.out.println("The cloned table look like this: ");
		for (Map.Entry<Integer, MusicExercise1> entry : tableClone.entrySet()) {
			int key= entry.getKey();
			MusicExercise1 m= entry.getValue();
			System.out.println(key+ " Details ");
			System.out.println(m.getName()+" - "+m.getGender()+" - "+m.getSinger()+" - "+m.getYearPublic()+" - "+m.getMothPublic()+" - "+m.getAlbum());
		}
		System.out.println("\n");
		
		
		//CLEAR()
		tableClone.clear();
		System.out.println("Delete The cloned table: ");
		for (Map.Entry<Integer, MusicExercise1> entry : tableClone.entrySet()) {
			int key= entry.getKey();
			MusicExercise1 m= entry.getValue();
			System.out.println(key+ " Details ");
			System.out.println(m.getName()+" - "+m.getGender()+" - "+m.getSinger()+" - "+m.getYearPublic()+" - "+m.getMothPublic()+" - "+m.getAlbum());
		}
		System.out.println("\n");
	
		
		//keySet().iterator()
		System.out.println("Keys of Hash Table");
		Iterator<Integer> itr = table1.keySet().iterator(); 
		while(itr.hasNext())  
		   {  
			   //imprima el siguiente elemento
		    System.out.println(itr.next());  
		   } 
		   //salto
		 System.out.println("\n");
		 
		 
		 
		 //values().iterator()
		 System.out.println("Values of Hash Table: ");
			Iterator<MusicExercise1> itr1 = table1.values().iterator(); 
			while(itr1.hasNext())  
			   {  
				   //imprima el siguiente elemento
				MusicExercise1 next= itr1.next();
			    System.out.println(next.getName()+" - "+next.getGender()+" - "+next.getSinger()+" - "+next.getYearPublic()+" - "+next.getMothPublic()+" - "+next.getAlbum());
			   } 
			 System.out.println("\n");
		 
			 
		 //entrySet().iterator()
		 Iterator<Entry<Integer, MusicExercise1>> itrEntry = table1.entrySet().iterator(); 
			while(itrEntry.hasNext())  
			{  
				Entry<Integer, MusicExercise1> itr123=itrEntry.next();
				System.out.println(itr123.getKey()+" = "+itr123.getValue().getName());
			} 
			System.out.println("\n");
			
			//COMPUTE
			MusicExercise1 newValue= new MusicExercise1("Del mar", "Urbano latino", " Ozuna, Sia", 2020, 10, "ENOC");
			System.out.println("New value: ");
			System.out.println(newValue.getName()+" - "+newValue.getGender()+" - "+newValue.getSinger()+" - "+newValue.getYearPublic()+" - "+newValue.getMothPublic()+" - "+newValue.getAlbum());
			System.out.println("\n");
			table1.compute(02, (key,val)->val=newValue);
			System.out.println("Update Table: ");
			for (Map.Entry<Integer, MusicExercise1> entry : table1.entrySet()) {
				MusicExercise1 m= entry.getValue();
				System.out.println(m.getName()+" - "+m.getGender()+" - "+m.getSinger()+" - "+m.getYearPublic()+" - "+m.getMothPublic()+" - "+m.getAlbum());
			}
			System.out.println("\n");
			
			
	}

}
