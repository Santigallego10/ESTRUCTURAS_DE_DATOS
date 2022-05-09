package Example1;

public class Main1 {
    public static void main(String[] args) {

        int array[][] = {{1,0,3},{0,0,4},{6,0,0}};

        int m = 3;
        int n = 3;
        int counter = 0;

        for(int i = 0; i<m; i++){
            for (int j=0;j<n;++j){
                if(array[i][j] == 0){
                    ++counter;
                }
            }
        }

        if(counter > ((m * n)/2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
