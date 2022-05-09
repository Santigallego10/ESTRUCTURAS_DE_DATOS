package co.edu.cue.ed.recursividad.app;

public class MainAlfabeto {

	public static void main(String[] args) {
		
		
		methodA('Z');

	}

	static void methodA(char c){
		if (c>='A') {
		methodB(c);
		System.out.println(c+ " ");
		}
	}
	
	static void methodB(char c){
		methodA(--c);
	}
}
