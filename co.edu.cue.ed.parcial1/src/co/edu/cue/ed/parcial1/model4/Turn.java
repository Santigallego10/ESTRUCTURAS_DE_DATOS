package co.edu.cue.ed.parcial1.model4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Turn {

	private Map<Integer,String> moduleList= new HashMap<Integer, String>();
	private List usersList= new ArrayList<User>();
	
	
	public Turn(){
		
	}
	
	public Turn(Map<Integer, String> moduleList, List usersList) {
		super();
		this.moduleList = moduleList;
		this.usersList = usersList;
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
