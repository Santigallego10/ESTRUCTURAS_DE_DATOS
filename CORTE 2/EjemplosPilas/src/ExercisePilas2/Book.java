package ExercisePilas2;

public class Book {

    private String name;
    private Identificador identificador;

    public Book(){

    }

    public Book(String name, Identificador identificador) {
        this.name = name;
        this.identificador = identificador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Identificador getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }
}
