package co.edu.cue.genericosEjemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Oferta<T> implements Iterable<T> {
    private List<T> productos;
    private int cantidadElmentos;

    public Oferta(int max){
        this.cantidadElmentos = max;
        this.productos = new ArrayList<>();

    }

    public void add(T objeto){
        if (this.productos.size()  <= cantidadElmentos){
            this.productos.add(objeto);

        }else{
            throw new RuntimeException("No se puede ofertar, se cumplio el limite");
        }

    }


    @Override
    public Iterator<T> iterator() { return this.productos.iterator();

    }
}
