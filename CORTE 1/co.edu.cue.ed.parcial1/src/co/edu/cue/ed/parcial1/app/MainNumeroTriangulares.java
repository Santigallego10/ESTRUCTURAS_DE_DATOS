package co.edu.cue.ed.parcial1.app;

import javax.swing.JOptionPane;

public class MainNumeroTriangulares {

	public static void main(String[] args) {

		int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de veces"));
		numeroTriangulares(1,numero);
		
	}
	
	public static Integer numeroTriangulares(int j, int n){
		if (n==1) {
			imprimirAsteriscos(j);
			return 1;
		} else {
			imprimirAsteriscos(j);
			return n+numeroTriangulares(j+1,n-1);
		}
	}
	
	public static void imprimirAsteriscos(int j){
		for (int i = 1; i <= j; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	
	
	
}