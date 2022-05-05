package Parcial.Ejercicio3;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ejercicio3 {
    public static void main(String[] args) {
        Hashtable paises = new Hashtable<>();
        System.out.println(paises);
        paises.put("ES","Espana");
        System.out.println(paises);
        paises.put("UK","Reino Unido");
        System.out.println(paises);
        paises.put("US","Estados Unidos");
        System.out.println(paises);
        paises.put("FR","Francia");
        System.out.println(paises);
        paises.replace("ES","Escocia");
        System.out.println(paises);

        Enumeration e = paises.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
