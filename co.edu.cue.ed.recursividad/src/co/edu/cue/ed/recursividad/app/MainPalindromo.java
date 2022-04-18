package co.edu.cue.ed.recursividad.app;

import javax.swing.JOptionPane;

import co.edu.cue.ed.recursividad.model.Palindromo;

public class MainPalindromo {

	public static void main(String[] args) {
		
		String chain= JOptionPane.showInputDialog("Ingrese la cadena: "); 
		int start= 0;
		System.out.println(start);
		int end= chain.length()-1;
		System.out.println(end);
		
		Palindromo palin= new Palindromo();
		
		boolean resultado=palin.palindromoBuscar(chain, start, end);
		if (resultado==true) {
			System.out.println("La palabra SI es palíndromo");
		} else {
			System.out.println("La palabra NO es palíndromo");
		}
	}

}
