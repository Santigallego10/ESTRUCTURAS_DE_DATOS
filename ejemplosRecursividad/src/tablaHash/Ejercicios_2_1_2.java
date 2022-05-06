package tablaHash;

import java.util.Hashtable;

public class Ejercicios_2_1_2 {


    public static void main(String[] args)
    {
// Creamos un objeto tabla por ejemplo con los nombres de personas  y sus edades.
        Hashtable<String, Integer> personasEdades = new Hashtable<>();

        personasEdades.put("Julio ", 20);
        personasEdades.put("Federico", 30);
        personasEdades.put("Luis", 25);
        personasEdades.put("Bop Patiño", 15);
        personasEdades.put("Nicolas", 40);

        System.out.println("Imprime la tabla Hash con los nombres de las personas y sus edades: " +personasEdades);

// Reemplazando un valor especifico Key , en esta caso se reemplaza la edad de Luis.
        Integer nuevaEdad = personasEdades.replace("Luis", 70);
        System.out.println("Imprimir la nueva edad de Luis: " +nuevaEdad);
        System.out.println("Se imprimi la tabla actualizada: " +personasEdades);

// Verificando que la tabla contenga un determinado nombre (key) por ejemplo Federico.
        boolean nombreKey = personasEdades.containsKey("Federico");
        System.out.println("Esta Federico en la tabla como llave: " +nombreKey);

// Verificando una edad en la tabla (valor).
        boolean edadValue = personasEdades.containsValue(40);
        System.out.println("Existe alguien en la tabla con la edad de 40 años : " +personasEdades);
    }
}











