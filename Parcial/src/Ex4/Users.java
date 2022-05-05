package Ex4;

public class Users {
    private String name;
    private String id;
    private Enum TypeOf;

    public Users() {
    }

    public Users(String name, String id, Enum typeOf) {
        this.name = name;
        this.id = id;
        TypeOf = typeOf;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Enum getTypeOf() {
        return TypeOf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTypeOf(Enum typeOf) {
        TypeOf = typeOf;
    }
}
