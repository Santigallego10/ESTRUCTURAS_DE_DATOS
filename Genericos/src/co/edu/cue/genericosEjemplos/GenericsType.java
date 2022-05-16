package co.edu.cue.genericosEjemplos;

public class GenericsType <T>{

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Panka"); // valid

        GenericsType type1 = new GenericsType();
        type1.set("Pankaj");  //valid
        type1.set(10);

    }


}
