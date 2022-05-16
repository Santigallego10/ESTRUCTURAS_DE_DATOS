package co.edu.cue.ejercicio4;



public class Elementos <E>{
    private String nombre;
    private int  cantidad;
    private double precio;
    private Type type;

    public Elementos() {
    }

    public Elementos(String nombre, int cantidad, double precio, Type type) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.type = type;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Elementos{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", tipo=" + type +
                '}';
    }













}
