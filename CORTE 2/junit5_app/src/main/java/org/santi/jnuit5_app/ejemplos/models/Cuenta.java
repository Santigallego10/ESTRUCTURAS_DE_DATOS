package org.santi.jnuit5_app.ejemplos.models;

import java.math.BigDecimal;
import java.util.Locale;

public class Cuenta {

    private String nombre;
    private BigDecimal saldo;

    public Cuenta(String nombre, BigDecimal saldo) {
        this.saldo = saldo;
        this.nombre = nombre.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object obj) {
        Cuenta c = (Cuenta) obj;
        if(!(obj instanceof Cuenta)){
            return false;
        }
        if(this.nombre == null || this.saldo == null){
            return false;
        }
        return this.nombre.equals(c.getNombre()) && this.saldo.equals(c.getSaldo());
    }
}
