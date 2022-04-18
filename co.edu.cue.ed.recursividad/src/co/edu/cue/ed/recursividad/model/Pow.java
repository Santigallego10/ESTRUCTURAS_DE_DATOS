package co.edu.cue.ed.recursividad.model;

public class Pow {
	
	public int pow(int x, int n){
		if (n==1) {
			return x;
		} else {
			return x*pow(x, n-1);
		}
	}
}
