package org.mhurtado.junit5app.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal(10000.123455));
       // cuenta.setPerson("Andres");
        String esperado = "Andres";
        String real = cuenta.getPerson();
       assertEquals(esperado,real);
       assertTrue(real.equals("Andres"));
    }

    @Test
    void TestBalanceCuenta(){
        Cuenta cuenta=new Cuenta("Andres", new BigDecimal(10000.123455));
        assertEquals(10000.123455, cuenta.getBalance().doubleValue());
        assertFalse(cuenta.getBalance().compareTo(BigDecimal.ZERO)<0);
        assertTrue(cuenta.getBalance().compareTo(BigDecimal.ZERO)>0);
    }
}