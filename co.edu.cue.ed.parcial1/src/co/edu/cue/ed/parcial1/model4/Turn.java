package co.edu.cue.ed.parcial1.model4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;


public class Turn {

	private static Map<Integer,String> moduleList= new TreeMap<Integer, String>();
	private static List<User> usersList= new ArrayList<User>();
	private int counterStudents;
	private int counterTeachers;
	
	
	public Turn(){
		this.addModules();
	}
	
	
	public void addModules(){
		moduleList.put(1, "Module 1");
		moduleList.put(2, "Module 2");
		moduleList.put(3, "Module 3");
	}
	
	//CREATE USERS
	public void createUsers(){

		User user= new User();
		String id=JOptionPane.showInputDialog("Enter the id for user");
		User userExist= verifyExist(id);
		if (userExist==null) {
			user.setId(id);
			user.setName(JOptionPane.showInputDialog("Enter the name for user"));
			int type=Integer.parseInt(JOptionPane.showInputDialog("Enter the option for the menu: "
					+ " \n 1. Student"
					+ " \n 2. Teacher"
					));
			verifySegmentType(type, user);
			usersList.add(user);
		}
		
	}

	//USER EXIST
	private User verifyExist(String id) {
		User userExist= null;
		for (User user : usersList) {
			if (user.getId().equalsIgnoreCase(id)) {
				userExist=user;
				System.out.println("The user exist");
				break;
			} 
		}
		return userExist;
		
	}

	//SEGMENT EXIST
	public void verifySegmentType(int type,User user){	
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
	
	//SHOW USERS
	public void showUsers(){
		for (User user : usersList) {
			System.out.println(user.toString());
		}
	}
	
	//SHOW THE STUDENTS AND TEACHER
	public void showCounters(){
		System.out.println("The number of students is: "+counterStudents+ "\n");
		System.out.println("The number of teacher is: "+ counterTeachers+ "\n");
	}
	
	
	//SHOW THE TICKET
	public void showTicket(int numberModule){
		String id= JOptionPane.showInputDialog("Enter the id for show your ticked");
		User userExist=verifyExist(id);
		
		if (userExist!=null) {
			
			if (numberModule<=3) {
				JOptionPane.showMessageDialog(null, "ID: "+userExist.getId()
				+ "\n"+"Segment Type: "+userExist.getSegmentType()
				+ "\n"+"Attention Module: "+moduleList.get(numberModule)
				);
			} else {
				System.out.println("The module is not available");
			}
		}
		
	}
	
	
	public void changeTurn(){
		if (usersList.size()>0) {
			String decision =JOptionPane.showInputDialog("Do you want to change the module? ");

			if (decision.equalsIgnoreCase("yes")) {
				int newNumberModule=Integer.parseInt(JOptionPane.showInputDialog("Enter the new module: "));
				JOptionPane.showMessageDialog(null, "Thi is your new ticket with the new Module: ");
				showTicket(newNumberModule);
			}else {
				JOptionPane.showMessageDialog(null, "Ok, you can continue");
			}
		} else {
			JOptionPane.showMessageDialog(null, "The list don't have Users");
		}
	}
	
	//CONSTRUCTOR
	public Turn(Map<Integer, String> moduleList, List<User> usersList) {
		super();
		this.moduleList = moduleList;
		Turn.usersList = usersList;
	}
	
	
	//GETTER AND SETTER
	public Map<Integer, String> getModuleList() {
		return moduleList;
	}
	public void setModuleList(Map<Integer, String> moduleList) {
		this.moduleList = moduleList;
	}
	
	public List<User> getUsersList() {
		return usersList;
	}
	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

	@Override
	public String toString() {
		return "Turn [moduleList=" + moduleList + ", usersList=" + usersList + "]";
	}
	
	
	
	
	
	
}
