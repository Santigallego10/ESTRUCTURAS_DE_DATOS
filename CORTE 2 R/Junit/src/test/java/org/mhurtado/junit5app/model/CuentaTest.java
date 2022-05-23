package org.mhurtado.junit5app.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mhurtado.junit5app.exception.DineroInsuficienteException;

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

    @Test
    void refDeCuenta() {
        Cuenta cuenta= new Cuenta("John Doe", new BigDecimal(8900.9997));
        Cuenta cuenta2= new Cuenta("John Doe", new BigDecimal(8900.9997));

        //assertNotEquals(cuenta, cuenta2);//debe ser correcto
        assertEquals(cuenta, cuenta2);//fallará, porque son dos instancias distintas, tienen mismo valor pero diferente puntero

    }

    @Test
    void debitoCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(100));
        assertNotNull(cuenta.getBalance());
        assertEquals(900, cuenta.getBalance().intValue());
        assertEquals("900.12345", cuenta.getBalance().toPlainString());
    }

    @Test
    void creditoCuenta() {
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        cuenta.credit(new BigDecimal(100));
        assertNotNull(cuenta.getBalance());
        assertEquals(1100, cuenta.getBalance().intValue());
        assertEquals("1100.12345", cuenta.getBalance().toPlainString());
    }

    @Test
    void dineroInsuficienteExceptionCuenta() {
        Cuenta cuenta = new Cuenta ("Andres", new BigDecimal("1000.12345"));
       Exception exception= assertThrows(DineroInsuficienteException.class, ()-> {
            cuenta.debito(new BigDecimal(1500));
        });
       String actual = exception.getMessage();
       String esperado = "Dinero insuficiente";
       assertEquals(esperado,actual);
       //Se compara el mensaje que le mandamos en cuenta y en cuentatest
    }

    @Test
    void testTransferirDineroCuenta() {
       Cuenta cuenta1= new Cuenta ("John Doe", new BigDecimal("2500"));
       Cuenta cuenta2 = new Cuenta ("Andres", new BigDecimal("1500.8989"));

       Banco banco = new Banco();
       banco.setNombre("Banco del estado");
       banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
       assertEquals("1000.8989", cuenta2.getBalance().toPlainString());
       assertEquals("3000", cuenta1.getBalance().toPlainString());
    }

    @Test
    void testRelacionBancoCuenta() {
        Cuenta cuenta1= new Cuenta ("John Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta ("Andres", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.addCuenta(cuenta1);
        banco.addCuenta(cuenta2);
        banco.setNombre("Banco del estado");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertEquals("1000.8989", cuenta2.getBalance().toPlainString());
        assertEquals("3000", cuenta1.getBalance().toPlainString());

        assertEquals(2, banco.getCuentas().size());
        assertEquals("Banco del estado", cuenta1.getBanco().getNombre());
        assertEquals("Andres", banco.getCuentas().stream()
                .filter(c -> c.getPerson().equals("Andres"))
                .findFirst()
                .get().getPerson());

        assertTrue(banco.getCuentas().stream()
                .anyMatch(c-> c.getPerson().equals("John Doe")));
    }
}