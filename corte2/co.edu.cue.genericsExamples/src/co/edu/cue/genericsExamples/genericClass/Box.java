package co.edu.cue.genericsExamples.genericClass;

public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println();
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();

        integerBox.setT(new Integer(10));
        integerBox.inspect(67);
    }
}
