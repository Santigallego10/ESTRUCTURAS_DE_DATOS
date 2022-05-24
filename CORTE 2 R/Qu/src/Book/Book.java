package Book;

public class Book {
    private Enum typeOf;
    private String name;

    public Book() {
    }

    public Book(Enum typeOf, String name) {
        this.typeOf = typeOf;
        this.name = name;
    }

    public Enum getTypeOf() {
        return typeOf;
    }

    public void setTypeOf(Enum typeOf) {
        this.typeOf = typeOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "     Book    " +
                "typeOf=" + typeOf +
                ", name='" + name + '\'' ;
    }
}
