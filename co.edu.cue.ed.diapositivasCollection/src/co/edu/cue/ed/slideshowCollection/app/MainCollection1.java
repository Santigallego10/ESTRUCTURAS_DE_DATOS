package co.edu.cue.ed.slideshowCollection.app;

import javax.swing.JOptionPane;

class Punto2D{
	
}
class Punto3D{
	
}
class PuntoPolar{
	
}

public class MainCollection1 {
	public static void main(String[] args) {
		final int N=99;		
		Object[] rr= new Object[N];
		int i=0;
		Boolean plus=true;
		
		while (plus && (i<N)) {
			int option=Integer.parseInt(JOptionPane.showInputDialog("Enter an option:"
					+ "1. 2D"
					+ "2. 3D"
					+ "3. polar"
					+ "4. OUT"));
			if (option==1) {
				rr[i++]= new Punto2D();
			} else if (option==2) {
				rr[i++]=new Punto3D();
			} else if (option==3) {
				rr[i++]= new PuntoPolar();
			} else {
				plus=false;
			}
		}
	}
}

