package co.edu.cue.ed.recursividad.model;

public class Palindromo {

	
	public boolean palindromoBuscar(String chain, int start, int end){
		if (start<end) {
			if (chain.charAt(start)==chain.charAt(end)) {
				palindromoBuscar(chain, start+1, end-1);
				return true;
			}
			return false;
		}
		return false;
	}
	
	
	
}
