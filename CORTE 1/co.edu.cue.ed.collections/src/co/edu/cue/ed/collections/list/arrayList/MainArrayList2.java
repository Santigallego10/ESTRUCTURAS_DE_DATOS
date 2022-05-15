package co.edu.cue.ed.collections.list.arrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList2 {

	public static void main(String[] args) {
	      ArrayList<Double> altura = new ArrayList();
	      int N;
	      double media;
	      N = numeroAlumnos();
	      //leemos la altura de los N alumnos
	      leerAlturas(altura, N);
	      //calculamos la media
	      media = calcularMedia(altura);
	      //mostramos los resultados
	      mostrarResultados(altura, media);
	}
	//M�todo para pedir por teclado el n�mero de alumnos de la clase
	   public static int numeroAlumnos() {
	      Scanner sc = new Scanner(System.in);
	      int n;
	      do {
	            System.out.print("Introduce n�mero de alumnos: ");
	            n = sc.nextInt();
	      } while (n < 1);
	      return n;
	   }

	 //Este m�todo recibe el ArrayList y el n�mero de alumnos de la clase
	   //Pide por teclado la altura de todos los alumnos y las guarda en el ArrayList
	   public static void leerAlturas(ArrayList<Double> a, int n) {
	      Scanner sc = new Scanner(System.in);
	      int i;
	      double alto;
	      for (i = 1; i <= n; i++) {
	           do {
	                 System.out.print("Alumno " + i + " altura: ");
	                 alto = sc.nextDouble();
	           } while (alto <= 0);
	           a.add(alto); //a�ade la altura al final del ArrayList
	      }
	  }
	   
	 //Este m�todo recibe el ArrayList con todas las alturas
	   //calcula y devuelve la media
	   public static double calcularMedia(
			   ArrayList<Double> a) {
	      double media = 0;
	      for (Double d : a) {
	            media = media + d;
	      }
	      return media / a.size();
	   }
	   
	 //Muestra la altura de todos los alumnos, la media y calcula y muestra
	   //cuantos alumnos hay con altura superior a la media
	   //y cu�ntos con altura inferior
	   public static void mostrarResultados(ArrayList<Double> a, double media) {                                
	      int superior = 0, inferior = 0;
	      System.out.println("alturas introducidas: ");
	      System.out.println(a);
	      for (Double d : a) {
	            if (d > media)
	                superior++;
	            else if (d < media)
	                       inferior++;
	      }
	      System.out.printf("Media: %.3f %n", media);
	      System.out.println("Hay " + superior + " alumnos m�s altos que la media");
	      System.out.println("Hay " + inferior + " alumnos m�s bajos que la media");
	   }
}