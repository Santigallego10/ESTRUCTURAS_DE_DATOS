package co.edu.cue.ed.generics.app;

import java.util.LinkedList;
import java.util.List;

public class EjemploGenericos {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(new Integer(1));
		Integer i= (Integer) list.iterator().next();
		System.out.println(i);
		
		
		List<Integer> list2 = new LinkedList<>();
		list2.add(8);
		list2.add(3);
		Integer i2= list2.iterator().next();
		Integer i3= list2.get(1);
		System.out.println(i2);
		System.out.println(i3);
	}

}