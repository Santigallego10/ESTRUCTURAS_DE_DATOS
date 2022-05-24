package Entities;

public class Clients {

    private String name;
    private String id;
    private Enum TypeOf;


    public Clients() {

    }

    public Clients(String name, String id, Enum typeOf) {
        this.name = name;
        this.id = id;
        TypeOf = typeOf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Enum getTypeOf() {
        return TypeOf;
    }

    public void setTypeOf(Enum typeOf) {
        TypeOf = typeOf;
    }
}
