package co.edu.cue.ed.auction.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class PrincipalAuction {

	Auction auction;
	
	List<User> usersList= new ArrayList<>();
	List<Product> productsList= new ArrayList<>();
	List<Auction> auctionList= new ArrayList<>();
	
	public List<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

	public List<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}

	public List<Auction> getAuctionList() {
		return auctionList;
	}

	public void setAuctionList(List<Auction> auctionList) {
		this.auctionList = auctionList;
	}


	public PrincipalAuction() {
		this.initializeData();
	}
	
	
	private void initializeData(){
		
		auction= new Auction();
		
		User user= new User();
		user.setName("Maria Fernanda Hurtado");
		user.setId("83743207409");
		user.setMail("mhurtado@gmail.com");
		user.setPhonenumber("4534634");
		usersList.add(user);
		auction.setUsers(usersList);
		
		user= new User();
		user.setName("Santiago Jaramillo");
		user.setId("82389214789");
		user.setMail("sjaramillo@gmail.com");
		user.setPhonenumber("4654654646");
		usersList.add(user);
		auction.setUsers(usersList);
		
		user= new User();
		user.setName("Santiago Gonzales");
		user.setId("4673905859");
		user.setMail("sgonzales@gmail.com");
		user.setPhonenumber("35754767");
		usersList.add(user);
		auction.setUsers(usersList);
		
		user= new User();
		user.setName("Karol Galindo");
		user.setId("8730498094");
		user.setMail("kgalindo@gmail.com");
		user.setPhonenumber("823780912");
		usersList.add(user);
		auction.setUsers(usersList);
		
		
		Product product= new Product();
		product.setCode("001");
		product.setName("PC GAMER HP");
		product.setPrice(6000000);
		productsList.add(product);
		auction.setProduct(product);
		
		product= new Product();
		product.setCode("002");
		product.setName("PC LENOVO");
		product.setPrice(3000000);
		productsList.add(product);
		auction.setProduct(product);
		
		System.out.println("Subasta inicializada");
	}
	
	
	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	public Auction createAuction(){
		Auction auction= null;
		
		List<User> userList2= new ArrayList<User>();
		
		User user= verifyUser(JOptionPane.showInputDialog("Enter the id for user "));
		userList2.add(user);
		
		Product product= verifyProduct(JOptionPane.showInputDialog("Enter the code"));
		
		if (userList2.size()==0 && product==null) {
			System.out.println("The user and/or product dont exist");
		}else {
			auction= new Auction();
			LocalDateTime time= LocalDateTime.now();
			auction.setDate(time);
			auction.setProduct(productsList.get(1));
			auction.setUsers(userList2);
			getAuctionList().add(auction);
			
		}
		return auction;
		
	}
	
	public User verifyUser(String id){
		User userExist= null;
		for (User user : usersList) {
			if (user.getId().equalsIgnoreCase(id)) {
				userExist=user;
				break;
			}
		}
		return userExist;
	}
	
	
	public Auction verifyAuction(Product product){
		Auction auctionExist= null;
		for (Auction auction : auctionList) {
			if (auction.getProduct().getCode().equalsIgnoreCase(product.getCode())) {
				auctionExist=auction;
				break;
			}
		}
		return auctionExist;
	}
	
	
	public Product verifyProduct(String code){
		Product productExist= null;
		for (Product product : productsList) {
			if (product.getCode().equalsIgnoreCase(code)) {
				productExist=product;
				break;
			}
		}
		return productExist;
	}
	
	
}