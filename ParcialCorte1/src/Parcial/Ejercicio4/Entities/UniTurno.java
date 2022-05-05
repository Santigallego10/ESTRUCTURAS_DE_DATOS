package Parcial.Ejercicio4.Entities;

import java.util.ArrayList;
import java.util.List;

public class UniTurno {
    private String nombre;
    private List<Modulo> modulos = new ArrayList<>();

    public UniTurno(String nombre, List<Modulo> modulos) {
        this.nombre = nombre;
        this.modulos = modulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }
}
