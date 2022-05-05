package co.edu.cue.parcial1.punto2;

public class punto2 {
    public static void main(String[] args) {
        //System.out.println( triangle(7) );
        printTriangle(1, 7);
    }

    private static int triangle(int n) {
        if (n == 1) return 1;
        else return n + triangle(n-1);
    }

    private static void printTriangle(int i, int j) {
        if (i == j) {
            printRow(i);
        } else {
            printRow(i);
            printTriangle(i+1, j);
        }
    }

    private static void printRow(int n) {
        if (n == 1) {
            System.out.println("* ");
        }
        else {
            System.out.print("* ");
            printRow(n-1);
        }
    }
}
