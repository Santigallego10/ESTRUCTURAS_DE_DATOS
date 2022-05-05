package co.edu.cue.parcial1.punto3;

import java.util.Enumeration;
import java.util.Hashtable;

public class punto3 {
    public static void main(String[] args) {
        Hashtable<String, String> paises = new Hashtable<>();

        paises.put("ES", "España");
        paises.put("UK", "Reino Unido");
        paises.put("US", "Estados Unidos");
        paises.put("FR", "Francia");
        paises.replace("ES", "Escocia");

        Enumeration<String> e = paises.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
