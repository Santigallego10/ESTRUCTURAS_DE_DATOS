package co.edu.cue.ed.generics.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Oferta<T> implements Iterable<T>{

	private List<T> productos;
	private int cantidadElementos;
	
	
	public Oferta(int max) {
		this.cantidadElementos=max;
		this.productos=new ArrayList<>();
	}

	
	public void add(T objeto){
		if (this.productos.size()<=cantidadElementos) {
			this.productos.add(objeto);
		} else {
			throw new RuntimeException("No se puede ofertar, se cumplio el limite");
		}
	}
	
	
	
	
	
	
	@Override
	public Iterator<T> iterator() {
		return this.productos.iterator();
	}
	
	
	
	
	
}
