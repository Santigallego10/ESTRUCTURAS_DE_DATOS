package co.edu.cue.taller2Genericos.model;

public class Lacteo extends Producto {
    private int cantidad;
    private int proteinas;

    public Lacteo() {
    }

    public Lacteo(double precio, int cantidad, String nombre, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }
}
