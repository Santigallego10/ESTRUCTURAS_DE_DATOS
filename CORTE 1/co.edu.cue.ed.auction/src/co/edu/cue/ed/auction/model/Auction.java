package co.edu.cue.ed.auction.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Auction {

	
	private Product product;
	private List<User> users= new ArrayList<User>();
	private LocalDateTime date;
	
	
	public Auction() {

	}

	public Auction(Product product, List<User> users, LocalDateTime date) {
		super();
		this.product = product;
		this.users = users;
		this.date = date;
	}
	
	
	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "Auction [product=" + product + ", users=" + users + ", date=" + date + "]"+"\n";
	}

	


	
	
}