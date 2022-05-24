package org.mhurtado.junit5app.model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.mhurtado.junit5app.exception.DineroInsuficienteException;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;



class CuentaTest {
    Cuenta cuenta;
    //referencia en cada metodo es ditinta, el orden es indiferente solo importa que la intancia sea diferente, orden aleatorio, podemos cambiar como funciona este ciclo de vida.
    //podemos estableces un orden, el orden no es tan imoportante como buena practicva, ordenar para establecer dependencia, es una muy mala practica.
    //NO SE QUIEREN GENERAR DEPENDENCIAS FUERTES. SE ORDENA CON FINES VISUALES, NO PARA GENERAR DEPENDENCIA
    //BEFORE ALL, ANTES DE TODOS LOS METODOS( ENVOLVER LA EJECUCION DE NUESTRA PRUEBA UNITARIA)
    //AFTER ALL, UNA SOLA VEZ AL FINAL.
    //CADA QUE SE EJECUTA UN METODO, REALIZA ALGUNA TAREA. BEFORE EACH

    @BeforeEach
    void initMetodoTest(){
        this.cuenta = new Cuenta("Andres", new BigDecimal(1000.12345));
        System.out.println("iniciando el metodo");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando el metodo de prueba");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializando el test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Finalizando el test");
        //alterar el comportamiento de la prueba unitaria
    }

    @Test
    @DisplayName("probando nombre de la cuenta!")
    void testNombreCuenta() {
        // cuenta.setPerson("Andres");
        String esperado = "Andres";
        String real = cuenta.getPerson();
        assertNotNull(real, () -> "La cuenta no puede ser nula");
        assertEquals(esperado, real, () -> "El nombre de la cuenta no es la que se esperaba: se esperaba "+esperado+
                " Sin embargo fue: " +real);
        assertTrue(real.equals("Andres"), () -> "nombre cuenta esperado debe ser igual a la real");
    }

    @Test
    @DisplayName("Probando el saldo de la cuenta, que no sea null, mayor que cero")
    void TestBalanceCuenta() {
        assertNotNull(cuenta.getBalance());
        assertEquals(1000.12345, cuenta.getBalance().doubleValue());
        assertFalse(cuenta.getBalance().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getBalance().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @DisplayName("Probando referencias e instancias que sean iguales, con el metodo equals")
    void refDeCuenta() {
        Cuenta cuenta = new Cuenta("John Doe", new BigDecimal(8900.9997));
        Cuenta cuenta2 = new Cuenta("John Doe", new BigDecimal(8900.9997));

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

        Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
            cuenta.debito(new BigDecimal(1500));
        });
        String actual = exception.getMessage();
        String esperado = "Dinero insuficiente";
        assertEquals(esperado, actual);
        //Se compara el mensaje que le mandamos en cuenta y en cuentatest
    }

    @Test
    void testTransferirDineroCuenta() {
        Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Andres", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.setNombre("Banco del estado");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertEquals("1000.8989", cuenta2.getBalance().toPlainString());
        assertEquals("3000", cuenta1.getBalance().toPlainString());
    }

    @Test
    @Disabled//esta desabilitado
    //ciclo de vida en el cualm se crea una instancia, al final del proceso se destruye, algo tiene que inicializar la instancia, la administa etc...
    @DisplayName("Probando relaciones entre las cuentas y el banco con assertAll")
    void testRelacionBancoCuenta() {
        fail();//metodo estatico de la clase assertions
        Cuenta cuenta1 = new Cuenta("John Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Andres", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.addCuenta(cuenta1);
        banco.addCuenta(cuenta2);
        banco.setNombre("Banco del estado");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertAll(() -> assertEquals("1000.8989", cuenta2.getBalance().toPlainString(),
                        ()-> "El valor del saldo de la cuenta 2 no es el esperado"),
                () -> assertEquals("3000", cuenta1.getBalance().toPlainString(),
                        ()-> "El valor del saldo de la cuenta 1 no es el esperado"),
                () -> assertEquals(2, banco.getCuentas().size(),
                        ()-> "El banco no tiene la cantidad de cuentas esperadas"),
                () -> assertEquals("Banco del estado", cuenta1.getBanco().getNombre()),
                () -> assertEquals("Andres", banco.getCuentas().stream()
                            .filter(c -> c.getPerson().equals("Andres"))
                            .findFirst()
                            .get().getPerson()),
                () -> assertTrue(banco.getCuentas().stream()
                            .anyMatch(c -> c.getPerson().equals("John Doe"))));

    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testSoloWindows() {
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.LINUX})
    void testSoloLinuxMac() {
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void noWindows() {
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void soloJdk8() {
    }
}