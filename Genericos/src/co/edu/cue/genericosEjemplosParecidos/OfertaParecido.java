package co.edu.cue.genericosEjemplosParecidos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OfertaParecido<T> implements Iterable<T> {

    private List<T> carros;
    private int cantidadCarros;

    public OfertaParecido(int max){
        this.cantidadCarros = max;
        this.carros = new ArrayList<>();

    }

    public void add(T objeto){
        if (this.carros.size()  <= cantidadCarros){
            this.carros.add(objeto);

        }else{
            throw new RuntimeException("No se puede ofertar, se cumplio el limite");
        }

    }


    @Override
    public Iterator<T> iterator() { return this.carros.iterator();

    }




}
