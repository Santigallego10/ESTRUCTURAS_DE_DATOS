package co.edu.cue.ed.generics.app;


public class Ejm3MainBox<T> {
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public <U extends Number> void inspect(U u){
		System.out.println("T: "+t.getClass().getName());
		System.out.println("U: "+u.getClass().getName());
	}
	
	
	public static void main(String[] args) {
		Ejm3MainBox<Integer> integerbox= new Ejm3MainBox<Integer>();
		integerbox.setT(new Integer(10));
		Integer i=67;
		integerbox.inspect(i);
		System.out.println("T is: "+integerbox.getT());
		System.out.println("U is: "+i);
	}

}
