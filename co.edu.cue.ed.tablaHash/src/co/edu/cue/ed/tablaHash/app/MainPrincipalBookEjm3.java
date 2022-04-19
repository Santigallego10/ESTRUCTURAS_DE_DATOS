package co.edu.cue.ed.tablaHash.app;

import java.util.Hashtable;
import java.util.Map;

public class MainPrincipalBookEjm3 {

	public static void main(String[] args) {

		Map<Integer, Book> map = new Hashtable<Integer, Book>();
		
		Book b1=new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2=new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3=new Book(103, "Operating System", "Galvin", "Wiley", 6);
	
		//ADICIONAR LOS LIBROS A LA LISTA(COLECCION)
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key= entry.getKey();
			Book b= entry.getValue();
			System.out.println(key+ " Details: ");
			System.out.println(b.getId()+" "+b.getName()+" "+b.getAutor()+" "+b.getPublisher()+" "+b.getQuantity());
		}
		
		
	
	}

}
