package co.edu.cue.ed.bolsaSupermercado.model;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

	private List<T> products;
	private int elementsAmount;
	
	public BolsaSupermercado(){
		
	}
	
	
	public BolsaSupermercado(int elementsAmount) {
		this.elementsAmount=elementsAmount;
		this.products=new ArrayList<>();
	}
	
	public List<T> getProducts() {
		return products;
	}

	public void setProducts(List<T> products) {
		this.products = products;
	}
	
	
	public void addProduct(T t){
		if (this.products.size()<=elementsAmount) {
			this.products.add(t);
		} else {
			throw new RuntimeException("You cant add this product to the bag");
		}
	}
	
	
}