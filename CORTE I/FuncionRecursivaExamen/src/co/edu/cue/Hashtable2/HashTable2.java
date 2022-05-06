package co.edu.cue.Hashtable2;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable2 {

    public static void main(String[] args) {
        Hashtable paises = new Hashtable(); // se crea una instancia de la tabla hash
        paises.put("ES", "España");  // se ingresa la clave que es el primer valor y el segundo que es el valor
        paises.put("UK", "Reino Unido");
        paises.put("US", "Estados Unidos");
        paises.put("FR", "Francia");
        paises.replace("ES", "Escocia"); // se reemplaza el valor de España pór el de Escocia

        Enumeration e = paises.elements(); // obtenemos la enumeracion de los elementos que estan en la tabla Hash
        while (e.hasMoreElements()){ // usamos el metodo hasMoreElements para saber si contiene mas elementos y obtenerlos
            System.out.println(e.nextElement()); // usamos el metodo de enumeracion nextElement para obtener los elementos de la  enumeracion e y luego mostrarlpos en consola
        }
    }


}
