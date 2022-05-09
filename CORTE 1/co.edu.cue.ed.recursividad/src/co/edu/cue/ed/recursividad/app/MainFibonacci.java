package co.edu.cue.ed.recursividad.app;

import javax.swing.JOptionPane;

import co.edu.cue.ed.recursividad.model.Fibonacci;

public class MainFibonacci {

	public static void main(String[] args) {
		//FIBONACCI
		
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
		
		Fibonacci fibo= new Fibonacci();
		
		System.out.println("El maximo es: ");
		
		for (int i = 0; i <= numero; i++) {
			System.out.println(i+". "+fibo.printFibonacci(i));
		}
		

	}

}
