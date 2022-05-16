package co.edu.cue.genericosEjemplosParecidos;

import co.edu.cue.genericosEjemplos.GenericsType;

public class GenericsTypeParecido <T> {

    private T a;

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Hola Mundo"); // valid

        GenericsType type1 = new GenericsType();
        type1.set("Hola Mundo");  //valid
        type1.set(11);

    }
}
