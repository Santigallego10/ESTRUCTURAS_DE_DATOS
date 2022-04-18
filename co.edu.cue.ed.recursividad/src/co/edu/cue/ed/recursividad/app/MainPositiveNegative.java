package co.edu.cue.ed.recursividad.app;

import co.edu.cue.ed.recursividad.model.PositiveNegative;

public class MainPositiveNegative {

	public static void main(String[] args) {
		
		int arrayNumbers[]= {-3,1,5,-10,-3};
		int start=0;
		int end= arrayNumbers.length;
		//POSITIVOS
		PositiveNegative positive= new PositiveNegative();
		int cantPositives= positive.positiveValues(arrayNumbers, start, end);
		System.out.println("La cantidad de positivos es: "+cantPositives);
		
		//NEGATIVOS
		int cantNegatives= positive.negativeValues(arrayNumbers, start, end);
		System.out.println("La cantidad de negativos es: "+cantNegatives);
	}

}
