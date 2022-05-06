package co.edu.cue.BuscaMinas;

import java.util.Random;
import java.util.Scanner;

public class BuscaMinas {

    private int[][] campoVisible = new int[10][10];
    private int[][] campoEscondido = new int[10][10];

    public void mostrarCampoVisible()
    {
        System.out.print("\t ");
        for(int i=0; i<10; i++)
        {
            System.out.print(" " + i + "  ");
        }
        System.out.print("\n");
        for(int i=0; i<10; i++)
        {
            System.out.print(i + "\t| ");
            for(int j=0; j<10; j++)
            {
                if(campoVisible[i][j]==0)
                {
                    System.out.print("?");
                }
                else if(campoVisible[i][j]==50)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(campoVisible[i][j]);
                }
                System.out.print(" | ");
            }
            System.out.print("\n");
        }
    }

    public void mostarCampoEscondido()
    {
        System.out.print("\t ");
        for(int i=0; i<10; i++)
        {
            System.out.print(" " + i + "  ");
        }
        System.out.print("\n");
        for(int i=0; i<10; i++)
        {
            System.out.print(i + "\t| ");
            for(int j=0; j<10; j++)
            {
                if(campoEscondido[i][j]==0)
                {
                    System.out.print(" ");
                }
                else if(campoEscondido[i][j]==100)
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(campoEscondido[i][j]);
                }
                System.out.print(" | ");
            }
            System.out.print("\n");
        }
    }

    public void fixVisible(int i, int j)
    {
        campoVisible[i][j] = 50;
        if(i!=0)
        {
            campoVisible[i-1][j] = campoEscondido[i-1][j];
            if(campoVisible[i-1][j]==0) campoVisible[i-1][j] = 50;
            if(j!=0)
            {
                campoVisible[i-1][j-1] = campoEscondido[i-1][j-1];
                if(campoVisible[i-1][j-1]==0) campoVisible[i-1][j-1]=50;

            }
        }
        if(i!=9)
        {
            campoVisible[i+1][j]=campoEscondido[i+1][j];
            if(campoVisible[i+1][j]==0) campoVisible[i+1][j]=50;
            if(j!=9)
            {
                campoVisible[i+1][j+1]= campoEscondido[i+1][j+1];
                if(campoVisible[i+1][j+1]==0) campoVisible[i+1][j+1] = 50;
            }
        }
        if(j!=0)
        {
            campoVisible[i][j-1]=campoEscondido[i][j-1];
            if(campoVisible[i][j-1]==0) campoVisible[i][j-1] = 50;
            if(i!=9)
            {
                campoVisible[i+1][j-1]=campoEscondido[i+1][j-1];
                if(campoVisible[i+1][j-1]==0) campoVisible[i+1][j-1] = 50;
            }
        }
        if(j!=9)
        {
            campoVisible[i][j+1]=campoEscondido[i][j+1];
            if(campoVisible[i][j+1]==0) campoVisible[i][j+1] = 50;
            if(i!=0)
            {
                campoVisible[i-1][j+1]=campoEscondido[i-1][j+1];
                if(campoVisible[i-1][j+1]==0) campoVisible[i-1][j+1] = 50;
            }
        }
    }

    public void fixNeighbours(int i, int j)
    {
        Random random = new Random();
        int x = random.nextInt()%4;

        campoVisible[i][j] = campoEscondido[i][j];

        if(x==0)
        {
            if(i!=0)
            {
                if(campoEscondido[i-1][j]!=100)
                {
                    campoVisible[i-1][j] = campoEscondido[i-1][j];
                    if(campoVisible[i-1][j]==0)  campoVisible[i-1][j] = 50;
                }
            }
            if(j!=0)
            {
                if(campoEscondido[i][j-1]!=100)
                {
                    campoVisible[i][j-1] = campoEscondido[i][j-1];
                    if(campoVisible[i][j-1]==0)  campoVisible[i][j-1] = 50;
                }

            }
            if(i!=0 && j!=0)
            {
                if(campoEscondido[i-1][j-1]!=100)
                {
                    campoVisible[i-1][j-1] = campoEscondido[i-1][j-1];
                    if(campoVisible[i-1][j-1]==0)  campoVisible[i-1][j-1] = 50;
                }

            }
        }
        else if(x==1)
        {
            if(i!=0)
            {
                if(campoEscondido[i-1][j]!=100)
                {
                    campoVisible[i-1][j] = campoEscondido[i-1][j];
                    if(campoVisible[i-1][j]==0)  campoVisible[i-1][j] = 50;
                }
            }
            if(j!=9)
            {
                if(campoEscondido[i][j+1]!=100)
                {
                    campoVisible[i][j+1] = campoEscondido[i][j+1];
                    if(campoVisible[i][j+1]==0)  campoVisible[i][j+1] = 50;
                }

            }
            if(i!=0 && j!=9)
            {
                if(campoEscondido[i-1][j+1]!=100)
                {
                    campoVisible[i-1][j+1] = campoEscondido[i-1][j+1];
                    if(campoVisible[i-1][j+1]==0)  campoVisible[i-1][j+1] = 50;
                }
            }
        }
        else if(x==2)
        {
            if(i!=9)
            {
                if(campoEscondido[i+1][j]!=100)
                {
                    campoVisible[i+1][j] = campoEscondido[i+1][j];
                    if(campoVisible[i+1][j]==0)  campoVisible[i+1][j] = 50;
                }
            }
            if(j!=9)
            {
                if(campoEscondido[i][j+1]!=100)
                {
                    campoVisible[i][j+1] = campoEscondido[i][j+1];
                    if(campoVisible[i][j+1]==0) campoVisible[i][j+1] = 50;
                }

            }
            if(i!=9 && j!=9)
            {
                if(campoEscondido[i+1][j+1]!=100)
                {
                    campoVisible[i+1][j+1] = campoEscondido[i+1][j+1];
                    if(campoVisible[i+1][j+1]==0) campoVisible[i+1][j+1] = 50;
                }
            }
        }
        else
        {
            if(i!=9)
            {
                if(campoEscondido[i+1][j]!=100)
                {
                    campoVisible[i+1][j] = campoEscondido[i+1][j];
                    if(campoVisible[i+1][j]==0)  campoVisible[i+1][j] = 50;
                }
            }
            if(j!=0)
            {
                if(campoEscondido[i][j-1]!=100)
                {
                    campoVisible[i][j-1] = campoEscondido[i][j-1];
                    if(campoVisible[i][j-1]==0)  campoVisible[i][j-1] = 50;
                }

            }
            if(i!=9 && j!=0)
            {
                if(campoEscondido[i+1][j-1]!=100)
                {
                    campoVisible[i+1][j-1] = campoEscondido[i+1][j-1];
                    if(campoVisible[i+1][j-1]==0)  campoVisible[i+1][j-1] = 50;
                }
            }
        }
    }

    public boolean Jugada()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("\nEscriba un numero para la fila: ");
        int i= sc.nextInt();
        System.out.print("Escriba un numero para la columna: ");
        int j= sc.nextInt();

        if(i<0 || i>9 || j<0 || j>9 || campoVisible[i][j]!=0)
        {
            System.out.print("\nEntrada incorrecta!!");
            return true;
        }

        if(campoVisible[i][j]==100)
        {
            mostarCampoEscondido();
            System.out.print("A pisado una mina!\n============GAME OVER============");
            return false;
        }
        else if(campoEscondido[i][j]==0)
        {
            fixVisible(i, j);
        }
        else
        {
            fixNeighbours(i, j);
        }

        return true;
    }

    public void construirMatrizEscondida()
    {
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                int cnt=0;
                if(campoEscondido[i][j]!=100)
                {

                    if(i!=0)
                    {
                        if(campoEscondido[i-1][j]==100) cnt++;
                        if(j!=0)
                        {
                            if(campoEscondido[i-1][j-1]==100) cnt++;
                        }

                    }
                    if(i!=9)
                    {
                        if(campoEscondido[i+1][j]==100) cnt++;
                        if(j!=9)
                        {
                            if(campoEscondido[i+1][j+1]==100) cnt++;
                        }
                    }
                    if(j!=0)
                    {
                        if(campoEscondido[i][j-1]==100) cnt++;
                        if(i!=9)
                        {
                            if(campoEscondido[i+1][j-1]==100) cnt++;
                        }
                    }
                    if(j!=9)
                    {
                        if(campoEscondido[i][j+1]==100) cnt++;
                        if(i!=0)
                        {
                            if(campoEscondido[i-1][j+1]==100) cnt++;
                        }
                    }

                    campoEscondido[i][j] = cnt;
                }
            }
        }

        //displayHidden();
    }

    public void colocarMinasCampo(int diff)
    {
        int var=0;
        while(var!=10)
        {
            Random random = new Random();
            int i = random.nextInt(10);
            int j = random.nextInt(10);
            //System.out.println("i: " + i + " j: " + j);
            campoEscondido[i][j] = 100;
            var++;
        }
        construirMatrizEscondida();
    }

    public boolean checkWin()
    {
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(campoVisible[i][j]==0)
                {
                    if(campoEscondido[i][j]!=100)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void iniciarJuego()
    {
        System.out.println("\n\n================ BIENVENIDO A BUSCAMINAS ! ================\n");
        colocarMinasCampo(1);

        boolean flag = true;
        while(flag)
        {
            mostrarCampoVisible();
            flag = Jugada();
            if(checkWin())
            {
                mostarCampoEscondido();
                System.out.println("\n================ GANO!!!================");
                break;
            }
        }
    }



    public static void main(String[] args)
    {
        BuscaMinas M = new BuscaMinas();
        M.iniciarJuego();
    }


}






