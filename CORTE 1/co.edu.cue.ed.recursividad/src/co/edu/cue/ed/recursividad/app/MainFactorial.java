package co.edu.cue.ed.recursividad.app;

import javax.swing.JOptionPane;

import co.edu.cue.ed.recursividad.model.Factorial;

public class MainFactorial {

	public static void main(String[] args) {
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
		
		Factorial factorial= new Factorial();
		
		long facto= factorial.calculateFactorial(numero);

		System.out.println("El factorial de "+numero+ " es: "+facto);
	}

}
