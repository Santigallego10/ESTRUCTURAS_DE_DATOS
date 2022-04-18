package co.edu.cue.ed.digiturno.app;

import javax.swing.JOptionPane;

import co.edu.cue.ed.digiturno.model.Client;
import co.edu.cue.ed.digiturno.model.DigiTurn;

public class Main {

	public static void main(String[] args) {
		DigiTurn turno= new DigiTurn();
		int option;	
		
	do {
		option=Integer.parseInt(JOptionPane.showInputDialog("Enter the option for the menu: "
				+ " \n 1. View the clients"
				+ " \n 2. View the client with identification"
				+ " \n 3. View the turn for the client"
				+ " \n 4. OUT"
				));
		
		switch (option) {
		case 1:
			turno.viewClientes();
			break;
		case 2:
			String identification=JOptionPane.showInputDialog("Hi, Enter the identification ");
			Client client=turno.searchClientIdentification(identification);
			System.out.println(client);
			
//			String identification=JOptionPane.showInputDialog("Hi, Enter the identification ");
//			Client client=turno.searchClientIdentificationRecursive(identification,0);
//			System.out.println(client);
			break;
		case 3:
			String identification1=JOptionPane.showInputDialog("Hi, for see your turn, please enter your identification: ");
			turno.showTurn(identification1);
			break;
		case 4:
			break;
		default:
			break;
		}
	} while (option!=4);
		
	}

}
