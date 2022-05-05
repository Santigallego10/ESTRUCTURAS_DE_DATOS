package co.edu.cue.ed.parcial1.model4;

import javax.swing.JOptionPane;

public class Terminal {

	private static Turn turn=new Turn();
	
	
	
	public static void createUsers(){

		User user= new User();
		user.setId(JOptionPane.showInputDialog("Enter the id"));
		user.setName(JOptionPane.showInputDialog("Enter the name"));
		int type=Integer.parseInt(JOptionPane.showInputDialog("Enter the option for the menu: "
				+ " \n 1. Student"
				+ " \n 2. Teacher"
				));
		verifySegmentType(type, user);
		turn.getUsersList().add(user);
	}
	
	
	
	
	public static void verifySegmentType(int type,User user){
		int counterStudents=0;
		int counterTeachers=0;
		
			if (type==1) {
				user.setSegmentType(SegmentType.STUDENT);
				counterStudents=counterStudents+1;
			} else if (type==2) {
				user.setSegmentType(SegmentType.TEACHER);
				counterTeachers= counterTeachers+1;
			} else {
				JOptionPane.showMessageDialog(null, "This segment type doesn't exist");
			}
		}

	
}
