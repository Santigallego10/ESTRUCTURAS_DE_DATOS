package org.santi.jnuit5_app.ejemplos.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
        //cuenta.setNombre("Andres");

        String esperado = "Andres";
        String real = cuenta.getNombre();

        assertEquals(esperado,real);
        assertTrue(real.equals("Andres"));



    }
}