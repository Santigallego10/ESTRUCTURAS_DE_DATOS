package co.edu.cue.genericsExamples.genericClass;

import javax.management.RuntimeErrorException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Oferta<T> implements Iterable<T> {
    private List<T> productos;
    private int cantidadElementos;

    public Oferta(int max) {
        this.productos = new ArrayList<>();
        this.cantidadElementos = max;
    }

    public void add(T objeto) {
        if (this.productos.size() <= cantidadElementos) {
            this.productos.add(objeto);
        } else {
            throw new RuntimeException("No se puede ofertar, se cumplió el límite");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
