package co.edu.cue.ed.recursividad.model;

public class PotenciaRecursiva {

	
	public int potenciaRecur(int base, int exponente){
		
		if (exponente==0){
			return 1;
		} else {
			return base*potenciaRecur(base, exponente-1);
		}
	}
}
