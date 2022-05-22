package co.edu.cue.tallerGrupal.model;

public class Client {
    private String name;
    private String id;
    private ClientTypes type;

    public Client(String name, String id, ClientTypes type) {
        this.name = name;
        this.id = id;
        this.type = type;
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

    public ClientTypes getType() {
        return type;
    }

    public void setType(ClientTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", type=" + type +
                '}';
    }
}
