package co.edu.cue.taller2Genericos.model;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
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
