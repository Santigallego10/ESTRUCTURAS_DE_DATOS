package co.edu.cue.genericosEjemplosParecidos;

import co.edu.cue.genericosEjemplos.Box;

public class BoxParecido <T> {
    private T a;

    public void set(T a){
        this.a = a;
    }

    public T get(){
        return a;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + a.getClass().getName());
        System.out.println("U: " + u.getClass().getName());

    }

    public static void  main(String[] args) {
        BoxParecido<Integer> integerBox = new BoxParecido<Integer>();
        integerBox.set(new Integer (10));
        integerBox.inspect(67);
    }







}
