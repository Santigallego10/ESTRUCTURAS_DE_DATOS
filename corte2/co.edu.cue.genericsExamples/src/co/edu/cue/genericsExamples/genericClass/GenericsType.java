package co.edu.cue.genericsExamples.genericClass;

public class GenericsType<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsType<String> type = new GenericsType<>();
        type.setT("Pankaj");

        GenericsType<Object> type1 = new GenericsType<>();
        type1.setT("Pankaj");
        type1.setT(10);
    }
}
