package co.edu.cue.ed.generics.app;

public class Ejm5MainGenericsType<T> {
	
	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	
	
	public static void main(String[] args) {
		Ejm5MainGenericsType<String> type= new Ejm5MainGenericsType<>();
		type.set("Pankaj");
		
		Ejm5MainGenericsType type1= new Ejm5MainGenericsType();
		type1.set("Pankaj");
		type1.set(10);	
		
		
		System.out.println(type.toString());
		System.out.println(type1.toString());
	}

	@Override
	public String toString() {
		return "Ejm5MainGenericsType [t=" + t + "]";
	}

}
