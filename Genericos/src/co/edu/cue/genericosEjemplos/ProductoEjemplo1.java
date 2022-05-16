package co.edu.cue.genericosEjemplos;

public class ProductoEjemplo1 {

    private int cod;
    private  String nombre;
    private float valorVenta;


    public ProductoEjemplo1(int cod, String nombre, float valorVenta) {
        this.cod = cod;
        this.nombre = nombre;
        this.valorVenta = valorVenta;
    }


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(float valorVenta) {
        this.valorVenta = valorVenta;
    }

    @Override
    public String toString(){
        return "Producto{" +"cod=" + cod + ", nombre=" + nombre + '\'' + " , valorVenta=" + valorVenta + '}';
    }

}
