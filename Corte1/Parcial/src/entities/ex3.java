package entities;

import java.util.Enumeration;
import java.util.Hashtable;

public class ex3 {
    public static void main(String[] args) {
        //we are putting the elements in hashtable
        Hashtable paises = new Hashtable();
        paises.put("ES","España");
        paises.put("UK", "Reino unido");
        paises.put("US", "Estados unidos");
        paises.replace("ES", "ESCOCIA");
        paises.put("FR", "Francia");
        //we´re replacing spain
        paises.replace("ES", "ESCOCIA");


        //creating an emputy enumeration to store the elements and how many they are.
        Enumeration e = paises.elements();
        //we are displaying the elements in the hashtable
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
