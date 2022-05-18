package co.edu.cue.stacksAndQueues.queueEx2;

public class Anuncio {
    private String nombre;
    private String description;
    private int valorOferta;

    public Anuncio(String nombre, String description, int valorOferta) {
        this.nombre = nombre;
        this.description = description;
        this.valorOferta = valorOferta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValorOferta() {
        return valorOferta;
    }

    public void setValorOferta(int valorOferta) {
        this.valorOferta = valorOferta;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "nombre='" + nombre + '\'' +
                ", description='" + description + '\'' +
                ", valorOferta=" + valorOferta +
                '}';
    }
}
