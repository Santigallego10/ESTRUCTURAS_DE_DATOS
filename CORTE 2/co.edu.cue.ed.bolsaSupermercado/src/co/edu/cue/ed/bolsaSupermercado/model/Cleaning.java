package co.edu.cue.ed.bolsaSupermercado.model;

public class Cleaning extends Product{

	private String components;
	private Double liters;
	
	public Cleaning() {

	}

	public Cleaning(String name, Double price,String components, Double liters) {
		super(name,price);
		this.components = components;
		this.liters = liters;
	}

	public String getComponents() {
		return components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public Double getLiters() {
		return liters;
	}

	public void setLiters(Double liters) {
		this.liters = liters;
	}

	@Override
	public String toString() {
		return "Cleaning [components=" + components + ", liters=" + liters + "]";
	}
	
	
	
	

}
