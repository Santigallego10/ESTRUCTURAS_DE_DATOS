package co.edu.cue.taller2Genericos.model;

public class NoPerecible extends Producto {
    private int contenido;
    private int calorias;

    public NoPerecible() {
    }

    public NoPerecible(double precio, int contenido, String nombre, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
