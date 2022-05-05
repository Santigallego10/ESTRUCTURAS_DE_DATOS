package co.edu.cue.ed.parcial1.app;

import javax.swing.JOptionPane;

public class MainNumeroTriangulares {

	public static void main(String[] args) {

		int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de veces"));
		numeroTriangulares(numero);
		
	}
	
	public static Integer numeroTriangulares(int n){
		if (n==1) {
			System.out.println("*");
			return 1;
		} else {
			imprimirAsteriscos(n);
			return n+numeroTriangulares(n-1);
		}
	}
	
	public static void imprimirAsteriscos(int n){
		
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	
	
	
}