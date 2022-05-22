package Supermarket;

public class Clients {
    private String name;
    private String id;

    public Clients(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Clients() {
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

    @Override
    public String toString() {
        return "Clients{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
