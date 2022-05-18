package org.santi.jnuit5_app.ejemplos.models;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.santi.jnuit5_app.ejemplos.exceptions.DineroInsuficienteException;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;


//@TestInstance(TestInstance.Lifecycle.PER_CLASS) //manejar ciclo de vida
class CuentaTest {

    Cuenta cuenta;

    //ES POSIBLE CREAR INSTANCIAS DE CLASES FUERA  DE LOS METODOS Y REUTILIZARLO EN CADA UNO DE ESTOS

    @Test
    @DisplayName("Probando nombre de la cuenta: ")
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
        //cuenta.setNombre("Andres");

        String esperado = "ANDRES";
        String real = cuenta.getNombre();

        assertNotNull(real,"La cuenta no puede ser nula");

        assertEquals(esperado,real, "Ese no es el nombre");
        assertFalse(real.equals("Andres"),"Es null");
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

    @ParameterizedTest
    @ValueSource(strings = {"100","200","300"})
    void testDebitoCuenta(String monto) {
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(monto));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);

    }

    @Test
    void testCredtitoCuenta() {
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
        cuenta.credito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1100, cuenta.getSaldo().intValue());
        assertEquals("1100.12345",cuenta.getSaldo().toPlainString());

    }

    @Test
    void testDineroInsuficiente() {

        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        Exception exception = assertThrows(DineroInsuficienteException.class, ()->{
           cuenta.debito(new BigDecimal(1500));
        });
        String actual = exception.getMessage();
        String esperado = "Dinero insuficiente";
        assertEquals(esperado, actual);
    }

    @Test
    @Disabled
    void testTransferirDineroCuentas() {
        Cuenta cuenta = new Cuenta("Jhon doe",new BigDecimal("2.500"));
        Cuenta cuenta2 = new Cuenta("Andres",new BigDecimal("2.500"));

        Banco banco = new Banco();
        banco.setNombre("BBVA");
        banco.transferir(cuenta2, cuenta, new BigDecimal(500));
        assertEquals("1.000",cuenta2.getSaldo().toPlainString());
        assertEquals("2.000",cuenta.getSaldo().toPlainString());

    }

    @Test
    @Disabled
    void testRelacionBancoCuentas() {
        Cuenta cuenta = new Cuenta("Jhon doe",new BigDecimal("2.500"));
        Cuenta cuenta2 = new Cuenta("Andres",new BigDecimal("2.500"));

        Banco banco = new Banco();

        banco.addCuenta(cuenta);
        banco.addCuenta(cuenta2);
        banco.setNombre("BBVA");
        banco.transferir(cuenta2, cuenta, new BigDecimal(500));

        assertAll(()->
        {
            assertEquals("1.000",cuenta2.getSaldo().toPlainString());
        },
                ()->{        assertEquals("2.000",cuenta.getSaldo().toPlainString());},
                ()->{        assertEquals(2,banco.getCuentas().size());},
                ()->{        assertEquals("BBVA",cuenta.getBanco().getNombre());}
        );


        //assertEquals("Andres",banco.getCuentas().stream().filter(c -> c.getNombre().equals("Andres")).findFirst().get().getNombre());

    }

    @Nested
    class SistemaOperativoTest{

        @RepeatedTest(value = 2, name = "{currentRepetition}")
        void testNombreCuenta(RepetitionInfo info) {
            if(info.getCurrentRepetition() == 2){
                System.out.println("esto en la 22222");
            }
            Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
            //cuenta.setNombre("Andres");

            String esperado = "ANDRES";
            String real = cuenta.getNombre();

            assertNotNull(real,"La cuenta no puede ser nula");

            assertEquals(esperado,real, "Ese no es el nombre");
            assertFalse(real.equals("Andres"),"Es null");
        }

        @Test
        @EnabledOnOs(OS.WINDOWS)
        void testSoloWindows(){
        }

        @Test
        @EnabledOnOs({OS.LINUX, OS.MAC })
        void testSoloLinuxMac() {
        }

        @Test
        @DisabledOnOs(OS.MAC)
        void noMac() {
        }
    }


    @Test
    void imprimirVariablesAmbiente() {
        Map<String, String> getenv = System.getenv();
        getenv.forEach((k, v)-> System.out.println(k + "=" +v));
    }

    @Test
    @EnabledIfEnvironmentVariable(named= "JAVA_HOME",matches = "xxxx-xxxx-xxxx")
    void testJavaHome() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "Numbers of processors",matches = "8")
    void testProcesadores() {
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "Environment",matches = "dev")
    void testEnv() {
    }

    @Test
    void testSaldoCuentaDev(){
        boolean esDev = "dev".equals(System.getProperty("ENV"));
        assumeTrue(esDev);
        Cuenta cuenta = new Cuenta("Andres", new BigDecimal("1000.12345"));
        assertEquals(1000.12345,cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);

    }

    @ParameterizedTest
    @CsvSource({"1,100","2,200","3,300"})
    void testDebitoCuentaCsvSource(String index, String monto) {
        System.out.println(index+"->"+monto);
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(monto));
        assertNotNull(cuenta.getSaldo());
        //assertEquals(900, cuenta.getSaldo().intValue());
        //assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void testDebitoCuentaCsvFileSource(String monto) {
        System.out.println("->"+monto);
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(monto));
        assertNotNull(cuenta.getSaldo());
        //assertEquals(900, cuenta.getSaldo().intValue());
        //assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);

    }

    @ParameterizedTest
    @MethodSource("montoList")
    void testDebitoCuentaMethodSource(String monto) {
        System.out.println("->"+monto);
        Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(monto));
        assertNotNull(cuenta.getSaldo());
        //assertEquals(900, cuenta.getSaldo().intValue());
        //assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);

    }

    private static List<String> montoList(){
        return Arrays.asList("100","200");
    }

    @ParameterizedTest
    @CsvSource({"200,100","250,200","300,300"})
    void testDebitoCuentaCsvSource2(String saldo, String monto) {
        Cuenta cuenta = new Cuenta("Jhon Doe",new BigDecimal("0"));
        System.out.println(saldo+"->"+monto);
        cuenta.setSaldo(new BigDecimal(saldo));
        cuenta.debito(new BigDecimal(monto));
        //Cuenta cuenta = new Cuenta("Andres",new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(monto));
        assertNotNull(cuenta.getSaldo());
        //assertEquals(900, cuenta.getSaldo().intValue());
        //assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO)>0);

    }



}






