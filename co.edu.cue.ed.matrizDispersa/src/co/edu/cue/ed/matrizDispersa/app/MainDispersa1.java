package co.edu.cue.ed.matrizDispersa.app;

public class MainDispersa1 {

	public static void main(String[] args) {

		int array[][]= {{1,0,3},{3,0,4},{0,0,0}};
		
		int m=3;
		int n=3;
		int counter= 0;
		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j]==0) {
					++counter;
				}
			}
		}
		if (counter > ((m*n)/2)) {
			System.out.println("Yes, this is a sparse matrix");
		} else {
			System.out.println("No, this is not a sparse matrix");
		}
	
	}

}
