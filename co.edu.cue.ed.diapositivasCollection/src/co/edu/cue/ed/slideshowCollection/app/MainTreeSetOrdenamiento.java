package co.edu.cue.ed.slideshowCollection.app;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSetOrdenamiento {

	public static void main(String[] args) {
		
		Set<Integer> ts= new TreeSet<>((a,b)->b.compareTo(a));
		ts.add(3);
		ts.add(5);
		ts.add(1);
		ts.add(22);
		ts.add(9);
		
		System.out.println("mostrar: "+ts);
		
		
		
	}

}
