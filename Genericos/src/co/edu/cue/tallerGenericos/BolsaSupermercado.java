package co.edu.cue.tallerGenericos;

import java.util.ArrayList;

public class BolsaSupermercado {

    private List<T> productos;
    private int cantidadElementos;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
        this.cantidadElementos = 5;
    }

    public void addProduct(T product) {
        productos.add(product);
    }

    public List<T> getProducts() {
        return productos;
    }






}
