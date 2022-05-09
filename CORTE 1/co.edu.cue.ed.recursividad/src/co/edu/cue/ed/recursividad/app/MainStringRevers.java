package co.edu.cue.ed.recursividad.app;

import co.edu.cue.ed.recursividad.model.StringRevers;

public class MainStringRevers {

	public static void main(String[] args) {
		String inputChain= "this is a testing for software";
		System.out.println("chain: "+ inputChain);
		
		StringRevers object= new StringRevers();
		System.out.println("inverted chain");
		object.reversString(inputChain);
				
	}

}
