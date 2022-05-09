package co.edu.cue.ed.recursividad.model;

public class StringRevers {

	
	public void reversString(String chain){
		if ((chain==null) || (chain.length() <=1)) {
			System.out.println(chain);
		}
		else {
			System.out.println(chain.charAt(chain.length()-1));
			reversString(chain.substring(0,chain.length()-1));
		}
	}
}
