package co.edu.cue.ed.generics.app;

import java.util.Arrays;
import java.util.List;

public class Ejm2Genericos {

	public static void main(String[] args) {

		Integer[] valoresOferta= {1,5,8};
		List<Integer> enterosLista= fromArrayToList(valoresOferta);
		System.out.println(enterosLista);
	}
	
	public static <T extends Number> List<T> fromArrayToList(T[] c){
		return Arrays.asList(c);
	}

}
