package co.edu.cue.ed.generics.ejercicio4;

import java.util.HashSet;
import java.util.Set;


public class Store<T> {
	
	public static void main(String[] args) {
		Set<Book> books= new HashSet<Book>();
		
		books.add(new Book("Divergente"));
		books.add(new Book("Insurgente"));
		books.add(new Book("Leal"));
		
		for (Book book2 : books) {
			System.out.println(book2.getName());
		}
		
		System.out.println("\n");
		
		Set<Video> videos= new HashSet<Video>();
		
		videos.add(new Video("Iron Man"));
		videos.add(new Video("Spider Man"));
		videos.add(new Video("Doctor Strange"));
		videos.add(new Video("Capitan America"));
		
		for (Video video : videos) {
			System.out.println(video.getName());
		}
		
		
		System.out.println("\n");
		Set<Magazine> magazines= new HashSet<Magazine>();
		
		magazines.add(new Magazine("VOGUE"));
		magazines.add(new Magazine("Vanity Fair"));
		magazines.add(new Magazine("TIME"));
		magazines.add(new Magazine("Cosmopolitan"));
		magazines.add(new Magazine("People"));
		
		for (Magazine magazine : magazines) {
			System.out.println(magazine.getName());
		}

	}

	
}