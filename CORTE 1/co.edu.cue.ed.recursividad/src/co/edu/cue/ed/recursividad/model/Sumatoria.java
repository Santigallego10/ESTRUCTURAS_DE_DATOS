package co.edu.cue.ed.recursividad.model;

public class Sumatoria {

	
	public long sumIntegers(int n){
		if (n==1){
			System.out.println(n);
			return 1;
		} else {
			System.out.println(n);
			return n+sumIntegers(n-1);
		}
	}
}
