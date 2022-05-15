package co.edu.cue.ed.auction.app;

import javax.swing.JOptionPane;

import co.edu.cue.ed.auction.model.PrincipalAuction;

public class Main {

	public static void main(String[] args) {
		
		PrincipalAuction auction= new PrincipalAuction();
		
		int option;	
		
		do {
			option=Integer.parseInt(JOptionPane.showInputDialog("Enter the option for the menu: "
					+ " \n 1. Bid on a product"
					+ " \n 2. Show users"
					+ " \n 3. Show products"
					+ " \n 4. Show auctions"
					+ " \n 5. OUT"
					));
			
			switch (option) {
			case 1:
				auction.createAuction();
				break;
			case 2:
				System.out.println(auction.getUsersList().toString());
				break;
			case 3:
				System.out.println(auction.getProductsList().toString());
				break;
			case 4:
				System.out.println(auction.getAuctionList().toString());
				break;
			case 5:
			default:
				break;
			}
		} while (option!=5);
			
		}
		
	}