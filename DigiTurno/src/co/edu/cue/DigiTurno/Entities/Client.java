package co.edu.cue.DigiTurno.Entities;

public class Client {

    private String name;
    private String id;
    private Enum Types;

    public Client(){

    }

    public Client(String name, String id, Enum types) {
        this.name = name;
        this.id = id;
        Types = types;
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

    public Enum getTypes() {
        return Types;
    }

    public void setTypes(Enum types) {
        Types = types;
    }
}
