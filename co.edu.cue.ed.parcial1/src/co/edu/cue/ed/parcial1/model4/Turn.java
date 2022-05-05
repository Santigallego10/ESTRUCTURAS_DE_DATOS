package co.edu.cue.ed.parcial1.model4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Turn {

	private Map<Integer,String> moduleList= new HashMap<Integer, String>();
	private static List<User> usersList= new ArrayList<User>();
	private int counterStudents;
	private int counterTeachers;
	
	
	public Turn(){
	}
	
	
	public void createUsers(){

		User user= new User();
		String id=JOptionPane.showInputDialog("Enter the id for user");
		verificarExistencia(id);
		user.setId(id);
		
		user.setName(JOptionPane.showInputDialog("Enter the name for user"));
		int type=Integer.parseInt(JOptionPane.showInputDialog("Enter the option for the menu: "
				+ " \n 1. Student"
				+ " \n 2. Teacher"
				));
		verifySegmentType(type, user);
		usersList.add(user);
	}

	private void verificarExistencia(String id) {
		for (User user : usersList) {
			if (user.getId().equalsIgnoreCase(id)) {
				System.out.println("The user exist");
				break;
			} else {
				System.out.println("You can create the user");
			}
		}
		
	}


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
	
	public void showUsers(){
		for (User user : usersList) {
			System.out.println(user.toString());
		}
	}
	
	public void showCounters(){
		System.out.println("The number of students is: "+counterStudents);
		System.out.println("The number of teacher is: "+ counterTeachers);
	}
	
	
	public Turn(Map<Integer, String> moduleList, List<User> usersList) {
		super();
		this.moduleList = moduleList;
		Turn.usersList = usersList;
	}
	
	
	
	public Map<Integer, String> getModuleList() {
		return moduleList;
	}
	public void setModuleList(Map<Integer, String> moduleList) {
		this.moduleList = moduleList;
	}
	public List getUsersList() {
		return usersList;
	}
	public void setUsersList(List usersList) {
		this.usersList = usersList;
	}

	@Override
	public String toString() {
		return "Turn [moduleList=" + moduleList + ", usersList=" + usersList + "]";
	}
	
	
	
	
	
	
}
