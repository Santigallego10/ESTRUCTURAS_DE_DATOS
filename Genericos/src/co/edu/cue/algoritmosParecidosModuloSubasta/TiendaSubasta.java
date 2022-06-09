package co.edu.cue.algoritmosParecidosModuloSubasta;

import co.edu.cue.algortimosModuloSubasta.UnaryPredicate;

import java.util.*;

public class TiendaSubasta  {

    List listaDeObjetos = new ArrayList<>();


    public TiendaSubasta(List listaDeObjetos) {
        this.listaDeObjetos = listaDeObjetos;
    }

    public TiendaSubasta() {
    }

    public List getListaDeObjetos() {
        return listaDeObjetos;
    }

    public void setListaDeObjetos(List listaDeObjetos) {
        this.listaDeObjetos = listaDeObjetos;
    }

    public void agregarObjetosAlaLista(){
        listaDeObjetos.add(new Joya());
        listaDeObjetos.add(new Pintura());
        listaDeObjetos.add(new Reloj());
        System.out.println(("La lista es :" + getListaDeObjetos()));

    }

    public static  int count(List ListaDeObjetos ) {

        int count = 0;
        for (Object elem : ListaDeObjetos)
                ++count;
        return count;
    }







}
