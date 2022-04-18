package co.edu.cue.ed.recursividad.app;

import javax.swing.JOptionPane;

import co.edu.cue.ed.recursividad.model.PotenciaRecursiva;

public class MainPotenciaRecursiva {

	public static void main(String[] args) {

		int base= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
		int exponente= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente"));
		
		PotenciaRecursiva potencia= new PotenciaRecursiva();
		int resultado= potencia.potenciaRecur(base, exponente);
		
		System.out.println("El resultado de "+base+" elevado a la "+ exponente+" es: "+resultado);
		
	}

}
