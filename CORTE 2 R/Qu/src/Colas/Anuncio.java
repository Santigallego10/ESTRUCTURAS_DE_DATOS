package Colas;

public class Anuncio {
    private String name;
    private String description;
    private int offeredValue;

    public Anuncio(String name, String description, int offeredValue) {
        this.name = name;
        this.description = description;
        this.offeredValue = offeredValue;
    }

    public Anuncio() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOfferedValue() {
        return offeredValue;
    }

    public void setOfferedValue(int offeredValue) {
        this.offeredValue = offeredValue;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", offeredValue=" + offeredValue +
                '}';
    }
}
