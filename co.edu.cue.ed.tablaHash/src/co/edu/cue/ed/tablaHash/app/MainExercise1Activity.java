package co.edu.cue.ed.tablaHash.app;

import java.util.Hashtable;
import java.util.Map;

import co.edu.cue.ed.tablaHash.model.MusicExercise1;

public class MainExercise1Activity {

	public static void main(String[] args) {

		Hashtable<Integer, MusicExercise1> table1= new Hashtable<Integer, MusicExercise1>();
		
		MusicExercise1 m1= new MusicExercise1("MAMI","Urbano Latino", "Karol G, Becky G", 2022, 04, "MAMIII");
		MusicExercise1 m2= new MusicExercise1("Tacones Rojos","Urbano latino, Pop", " John Legend, Sebastián Yatra", 2022, 03, "Tacones Rojos");
		MusicExercise1 m3= new MusicExercise1("12x3","Urbano Latino", "Dekko", 2021, 12, "12x3");
		MusicExercise1 m4= new MusicExercise1("Fuera del Mercado","Urbano Latino", "Danny Ocean", 2022, 02, "@dannocean");
		
		table1.put(01, m1);
		table1.put(02, m2);
		table1.put(03, m3);
		table1.put(04, m4);
		
		System.out.println("Size of the hash table: "+ table1.size());
		System.out.println("\n");
		
		
		MusicExercise1 remove= table1.remove(03);
		System.out.println("Remove element 03: ");
		System.out.println(remove.getName()+" "+remove.getGender()+" "+remove.getSinger()+" "+remove.getYearPublic()+" "+remove.getMothPublic()+" "+remove.getAlbum());
		System.out.println("\n");
		
		
		System.out.println("New hash table: ");
		for (Map.Entry<Integer, MusicExercise1> entry : table1.entrySet()) {
			int key= entry.getKey();
			MusicExercise1 m= entry.getValue();
			System.out.println(key+ " Details ");
			System.out.println(m.getName()+" "+m.getGender()+" "+m.getSinger()+" "+m.getYearPublic()+" "+m.getMothPublic()+" "+m.getAlbum());
		}
		System.out.println("\n");
		
		
		MusicExercise1 mE= table1.get(02);
		System.out.println("Song with key=02: "+mE.getName()+" "+mE.getGender()+" "+mE.getSinger()+" "+mE.getYearPublic()+" "+mE.getMothPublic()+" "+mE.getAlbum());
		System.out.println("\n");
		
		//add new objects
		table1.put(05, m3);
		table1.put(03, m1);
		
		
		MusicExercise1 newM= new MusicExercise1("Permission to dance", "Kpop, Pop", "BTS", 2021, 07, " Permission to Dance (R&B Remix)");
		MusicExercise1 replace= table1.replace(01, newM);
		System.out.println("New hash table with updated: ");
		for (Map.Entry<Integer, MusicExercise1> entry : table1.entrySet()) {
			int key= entry.getKey();
			MusicExercise1 m= entry.getValue();
			System.out.println(key+ " Details ");
			System.out.println(m.getName()+" "+m.getGender()+" "+m.getSinger()+" "+m.getYearPublic()+" "+m.getMothPublic()+" "+m.getAlbum());
		}
		System.out.println("\n");
		
		
		boolean includesKey= table1.containsKey(05);
		System.out.println("In the hash table there is the key 05: "+includesKey);
		System.out.println("\n");
		
		boolean includesValue= table1.containsValue(m2);
		System.out.println("In the hash table there is the value m3: "+includesValue);
		System.out.println("\n");
		
		
		
		
	}

}
