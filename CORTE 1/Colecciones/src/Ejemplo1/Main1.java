package Ejemplo1;

import java.util.Scanner;

class Punto2D {

}

class Punto3D {

}

class PuntoPolar {

}

public class Main1 {
    public static void main(String[] args) {
        final int N = 99;
        Object[] rr = new Object[N];
        int i = 0;
        Boolean mas = true;
        Scanner sr = new Scanner(System.in);
        while (mas && (i < N)){
            System.out.println("Ingrese una opcion 1 2D, 2 3D, 3 polar, y 4 para salir");
            int opc = sr.nextInt();
            if(opc == 1)
                rr[i++] = new Punto2D();
            else if (opc == 2)
                rr[i++] = new Punto3D();
            else if (opc == 3)
                rr[i++] = new PuntoPolar();
            else mas = false;
        }
    }
}
