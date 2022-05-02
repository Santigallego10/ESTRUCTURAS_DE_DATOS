package co.edu.cue.ed.auction.model;

public class Product {

	
	private String name;
	private String code;
	private float price;
	
	
	public Product() {

	}
	
	
	public Product(String name, String code, float price) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", code=" + code + ", price=" + price + "]"+"\n";
	}
	
	
	
	
	
}
