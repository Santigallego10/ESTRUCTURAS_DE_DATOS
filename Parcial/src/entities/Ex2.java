package entities;

public class Ex2 {
            static void print(int i)
            {

                if (i == 0)
                    //si i es igual a 0
                    return;
                //que imprima un asterisco
                System.out.print ("* ");

                //aqui usamos la recursividad para que i sea igual a 1 y lo restemos para que de esta manera podamos imprimir el primer asterisco.
                print(i - 1);
            }


            static void pattern(int n, int j)
            {
                if (n == 0)
                    return;
                print(j);

                System.out.println();
                pattern(n - 1, j + 1);
            }


            public static void main (String[] args)
            {
                int n = 5;
                pattern(n, 1);
            }
        }





