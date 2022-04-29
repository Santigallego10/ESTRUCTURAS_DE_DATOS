package co.edu.cue.ed.tablaHash.app;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1Ejm2 {

	
	public static void main(String[] args) {

		Hashtable<Integer, String> hm= new Hashtable<Integer, String>();
		
		hm.put(100, "Ana");
		hm.put(102, "Luis");
		hm.put(101, "Santiago");
		hm.put(103, "Mafe");
		
		//IMPRIMIR TODOS
		//Map.Entry---> se usa para obtener tanto claves como valores
		//entrySet()---> obtiene un objeto, la pareja clave-valor
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			if (m.getValue()=="Mafe") {
				System.out.println("----"+m.getValue()+"HOLIWIIIS");
			}
			Integer inte=101;
			if (m.getKey()==inte) {
				System.out.println("----"+m.getKey()+"HOLIs");
			}
		}
		//IMPRIMIR UNO ESPECIFICO, Y SI NO LO ENCUENTRA MOSTRAR MENSAJE
		System.out.println(hm.getOrDefault(101, "Not Found"));
		System.out.println(hm.getOrDefault(105, "Not Found"));
		
		//mostrar
		System.out.println("initial Map: "+hm);
		
		//agregar si la clave no esta(no esta)
		hm.putIfAbsent(104, "Arle");
		System.out.println("Update Map: "+hm);
		
		//agregar si la clave no esta (si esta)
		//entonces no lo agrega
		hm.putIfAbsent(101, "pepe");
		System.out.println("Update Map: "+hm);
		
		//ELIMINAR
		hm.clear();
		System.out.println("Delete Map: "+hm);
		
	}

}