package co.edu.cue.ed.parcial1.app4;


import javax.swing.JOptionPane;
import co.edu.cue.ed.parcial1.model4.Turn;

public class MainTurn {

	public static void main(String[] args) {
		
		int option;	
		Turn turn = new Turn();
		
		do {
			option=Integer.parseInt(JOptionPane.showInputDialog("Enter the option for the menu: "
					+ " \n 1. Create user"
					+ " \n 2. Show users"
					+ " \n 3. Show counter of students and teachers"
					+ " \n 4. Show ticket"
					+ " \n 5. OUT"
					));
			
			switch (option) {
			case 1:
				turn.createUsers();
				break;
			case 2:
				turn.showUsers();
				break;
			case 3:
				turn.showCounters();
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (option!=5);
			
		}
	
	
	
	
	
	

}
