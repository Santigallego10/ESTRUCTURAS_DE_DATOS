package matrizDispersa;

public class Dispersa1 {

    public static void main(String[] args) {

        //Initialising and declaring
        // variables and array

        int array[][] = {{1,0,3},{0,0,4},{6,0,0}};

        int m = 3;
        int n = 3;
        int counter = 0;

        // Count number of zeros in the matrix

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if(array[i][j] == 0)
                    ++counter;

        // Printing result
        if (counter > ((m * n) / 2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
