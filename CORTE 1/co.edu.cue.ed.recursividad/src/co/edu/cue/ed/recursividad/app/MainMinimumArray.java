package co.edu.cue.ed.recursividad.app;

import co.edu.cue.ed.recursividad.model.MinimumArray;


public class MainMinimumArray {

	public static void main(String[] args) {

		int numArray[]= {7,32,2,10,23};
		int start=0;
		int end=numArray.length-1;
		
		MinimumArray minimum= new MinimumArray();
		int minimumNumber= minimum.minimumValue(numArray, start, end);
		
		System.out.println("El numero menor del arreglo es: "+minimumNumber);
	}

}
