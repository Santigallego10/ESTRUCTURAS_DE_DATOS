package co.edu.cue.funcionRecursivaExamen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TriangleApp
{
    static int theNumber;
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number:  ");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle=" +theAnswer);

    } // end main()
    //-------------------------------------------------------------
    public static int triangle(int n)
    {
        if(n==1)
            return 1;
        else
            return( n + triangle(n-1) );
    }
    //-------------------------------------------------------------
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    //--------------------------------------------------------------
    public static int getInt() throws IOException
    {
        String s = getString();
        return Integer.parseInt(s);
    }
//--------------------------------------------------------------

    public static void imprimeAstrisco()
    {

        for (int x = 1; x <= theNumber; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }
}



 // end class TriangleApp
////////////////////////////////////////////////////////////////
