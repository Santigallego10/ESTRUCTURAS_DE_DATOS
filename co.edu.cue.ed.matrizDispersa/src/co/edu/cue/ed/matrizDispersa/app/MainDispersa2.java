package co.edu.cue.ed.matrizDispersa.app;

import java.util.ArrayList;
import java.util.List;

public class MainDispersa2 {

	public static void main(String[] args) {

		int sparseMatrix[][]
				={
					{0,0,3,0,4},
					{0,0,5,7,0},
					{0,0,0,0,0},
					{0,2,6,0,0}
			};
		
		//List arrayList= new ArrayList<E>();
	
		int size=0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (sparseMatrix[i][j]!=0) {
					size++;
				}
			}
		}
		
		
		int compactMatrix[][]= new int[3][size];
		
		int k=0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if (sparseMatrix[i][j]!=0) {
					compactMatrix[0][k]=i;
					compactMatrix[1][k]=j;
					compactMatrix[2][k]=sparseMatrix[i][j];
					k++;
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < size; j++) {
				if (i==0 && j==0) {
					System.out.print("FILA    ");
				}
				if (i==1 && j==0) {
					System.out.print("COLUMNA ");
				}
				if (i==2 && j==0) {
					System.out.print("VALOR   ");
				}
				System.out.printf(" %d", compactMatrix[i][j]);
			}
			System.out.printf("\n");
		}
		
	
	}

}
