package co.edu.cue.ed.recursividad.model;

public class PositiveNegative {

	
	public int positiveValues(int[] numArray, int start, int end){
		int contadorPositives=0;
		if(start<end){
			if(numArray[start]>0){
				contadorPositives=1+positiveValues(numArray, start+1, end);
				return contadorPositives;
				} else {
					contadorPositives=0+positiveValues(numArray, start+1, end);
					return contadorPositives;
					}
			} 
		return 0;
	}
	
	public int negativeValues(int[] numArray, int start, int end){
		int contadorNegativos=0;
		if(start<end){
			if(numArray[start]<0){
				contadorNegativos=1+negativeValues(numArray, start+1, end);
				return contadorNegativos;
				} else {
					contadorNegativos=0+negativeValues(numArray, start+1, end);
					return contadorNegativos;
					}
			} 
		return 0;
	}
	
	
}
