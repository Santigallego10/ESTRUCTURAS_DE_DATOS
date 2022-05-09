package co.edu.cue.ed.recursividad.app;

import javax.swing.JOptionPane;

import co.edu.cue.ed.recursividad.model.Sumatoria;

public class MainSumatoria {

	public static void main(String[] args) {
		
		//SUMATORIA
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de veces"));
		
		Sumatoria sumatoria= new Sumatoria();
		long suma= sumatoria.sumIntegers(numero);
		
		System.out.println("Resultado: "+ suma);

	}

}
