package org.santi.jnuit5_app.ejemplos.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
        //cuenta.setNombre("Andres");

        String esperado = "ANDRES";
        String real = cuenta.getNombre();

        assertEquals(esperado,real);
        assertTrue(real.equals("Andres"));
    }

    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        assertEquals(1000.12345,cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

    }

    @Test
    void testReferenciaCuenta() {
        Cuenta cuenta = new Cuenta("Jhon Doe", new BigDecimal("8900.000"));
        Cuenta cuenta2 = new Cuenta("Jhon Doe", new BigDecimal("8900.000"));

        assertEquals(cuenta2,cuenta);
        //assertNotEquals(cuenta2,cuenta);


    }
}