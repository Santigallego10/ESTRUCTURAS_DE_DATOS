package Main.Ejemplo3;

public class Box <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: "+ t.getClass().getName());
        System.out.println("U: "+ u.getClass().getName());
    }

    public static void main(String[] args){
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        integerBox.inspect(67);
    }

    private void set(T integer) {
    }
}
