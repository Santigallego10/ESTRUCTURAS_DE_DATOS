package co.edu.cue.ed.parcial1.app4;

import java.rmi.server.UID;

import javax.swing.JOptionPane;
import javax.swing.text.Segment;
import co.edu.cue.ed.parcial1.model4.SegmentType;
import co.edu.cue.ed.parcial1.model4.Terminal;
import co.edu.cue.ed.parcial1.model4.Turn;
import co.edu.cue.ed.parcial1.model4.User;
import javafx.print.PrinterJob.JobStatus;

public class MainTurn {

	public static void main(String[] args) {
		
		int option;	
		Terminal terminal= new Terminal();
		Turn turn= new Turn();
		
		do {
			option=Integer.parseInt(JOptionPane.showInputDialog("Enter the option for the menu: "
					+ " \n 1. Create user"
					+ " \n 2. Show users"
					+ " \n 3. Show ticket"
					+ " \n 4. OUT"
					));
			
			switch (option) {
			case 1:
				Terminal.createUsers();
				break;
			case 2:
				System.out.println(turn.getUsersList().toString());
				break;
			case 4:
				break;
			default:
				break;
			}
		} while (option!=3);
			
		}
	
	
	
	
	
	

}
