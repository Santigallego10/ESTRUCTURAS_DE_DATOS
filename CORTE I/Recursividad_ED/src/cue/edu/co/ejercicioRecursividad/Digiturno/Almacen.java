package cue.edu.co.ejercicioRecursividad.Digiturno;

import java.util.ArrayList;

public class Almacen {

    private String nombre;
    private String nit;
    ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    public Almacen(String nombre, String nit, ArrayList<Cliente> listaDeClientes) {
        this.nombre = nombre;
        this.nit = nit;
        this.listaDeClientes = listaDeClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }







}
