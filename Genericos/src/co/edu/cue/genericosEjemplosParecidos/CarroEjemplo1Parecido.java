package co.edu.cue.genericosEjemplosParecidos;

public class CarroEjemplo1Parecido {

    private String marca;
    private int kilometraje;
    private Double precio;


    public CarroEjemplo1Parecido(String marca, int kilometraje, Double precio) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.precio = precio;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "carro{" +"marca=" + marca + ", kilometraje=" + kilometraje + '\'' + " , precio=" + precio + '}';
    }



}
