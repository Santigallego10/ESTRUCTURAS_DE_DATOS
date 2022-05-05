package co.edu.cue.ed.parcial1.app;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable2 {

	public static void main(String[] args) {

		Hashtable<String, String> paises= new Hashtable();
		
		paises.put("ES", "España");
		paises.put("UK", "Reino Unido");
		paises.put("US", "Estados Unidos");
		paises.put("FR", "Francia");
		paises.replace("ES", "Escocia");
		
		//System.out.println(paises.toString());
		
		
		Enumeration e=paises.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
