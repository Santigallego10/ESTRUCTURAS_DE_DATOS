package co.edu.cue.ed.recursividad.model;

public class Factorial {

	
	public long calculateFactorial(int n){
		if (n<=1) {
			System.out.println(n);
			return 1;
		}
		else {
			System.out.println(n);
			return n*calculateFactorial(n-1);
		}
	}
}
