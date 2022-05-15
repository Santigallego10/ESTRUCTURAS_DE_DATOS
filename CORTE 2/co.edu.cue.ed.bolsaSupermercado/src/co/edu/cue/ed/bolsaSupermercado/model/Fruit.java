package co.edu.cue.ed.bolsaSupermercado.model;

public class Fruit extends Product{

	private Double weight;
	private String color;
	
	
	public Fruit() {
		
	}
	
	
	public Fruit(String name, Double price, Double weight, String color) {
		super(name,price);
		this.weight = weight;
		this.color = color;
	}
	
	
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [weight=" + weight + ", color=" + color + "]";
	}

}

