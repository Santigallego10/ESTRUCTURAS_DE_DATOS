package co.edu.cue.ed.recursividad.app;

import javax.swing.JOptionPane;

import co.edu.cue.ed.recursividad.model.Pow;

public class MainPow {

	public static void main(String[] args) {
		int numberX= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la x"));
		int numberN= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la n"));
		
		Pow pow= new Pow();
		int resultado= pow.pow(numberX, numberN);
		
		System.out.println("El resultado es: "+ resultado);

	}

}
