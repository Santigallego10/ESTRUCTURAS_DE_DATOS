package Application.Example2;

public class Anuncio {

    private String nombre;
    private String descripcion;
    private int valorOferta;

    public Anuncio(String nombre, String descripcion, int valorOferta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorOferta = valorOferta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
                ", descripcion='" + descripcion + '\'' +
                ", valorOferta=" + valorOferta +
                '}';
    }
}
