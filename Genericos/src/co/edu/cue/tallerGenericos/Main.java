package co.edu.cue.tallerGenericos;

public class Main {

    public static void main(String[] args) {
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpiezas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaFrutas.addProduct(new Fruta(1200.00, "roja", "manzana fuji",2500d));
        bolsaFrutas.addProduct(new Fruta(800.00, "rojos", "duraznos", 1800d));
        bolsaFrutas.addProduct(new Fruta(1000.00, "verdes", "ubas", 3500d));
        bolsaFrutas.addProduct(new Fruta(1200.00, "amarillos", "limones", 1500d));
        bolsaFrutas.addProduct(new Fruta(1200.00, "sandia", "sandia", 4000d));

        bolsaLimpiezas.addProduct(new Limpieza("antibacterial", 0.75, "Cif", 1690));
        bolsaLimpiezas.addProduct(new Limpieza("lavaloza", 1.2, "Quix", 2290));
        bolsaLimpiezas.addProduct(new Limpieza("cloro", 0.95, "Limpiador Crema", 1390));
        bolsaLimpiezas.addProduct(new Limpieza("Gel con Lavandinca", 0.45, "Lysoform", 1380));
        bolsaLimpiezas.addProduct(new Limpieza("Desinfectante Lavanda", 0.9, "Lysol", 1330));

        bolsaLacteos.addProduct(new Lacteo (1000, 32, "Leche Sabor Chocolate Semidescremada", 1150));
        bolsaLacteos.addProduct(new Lacteo (200, 4, "Crema de Leche caja", 800));
        bolsaLacteos.addProduct(new Lacteo (1000, 31, "Leche Blanca Descremada Caja", 720));
        bolsaLacteos.addProduct(new Lacteo (1000, 37, "Yoghurt Batido Sabor Frutilla Bolsa", 1190));
        bolsaLacteos.addProduct(new Lacteo(250, 2, "Mantequilla Con Sal Soprole", 1750));

        bolsaNoPerecibles.addProduct(new NoPerecible(170, 95, "Atún Lomitos en Agua Angelmo", 960));
        bolsaNoPerecibles.addProduct(new NoPerecible(425, 560, "Jurel Natural Lata", 1120));
        bolsaNoPerecibles.addProduct(new NoPerecible(380, 234, "Porotos Negros Listos Para Servir Caja", 1030));
        bolsaNoPerecibles.addProduct(new NoPerecible(1000, 3340, "Arroz Grano Largo Ancho Grado 1", 1320));
        bolsaNoPerecibles.addProduct(new NoPerecible(1000, 3536, "Porotos Hallado Bolsa", 1990));

        System.out.println("-------------------------------- Frutas ---------------------------------");

        for (Fruta fruta : bolsaFrutas.getProducts()) {
            System.out.println("-------------------------------- " +  fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso (gr): " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }

        System.out.println("-------------------------------- Limpieza ---------------------------------");

        for (Limpieza prod : bolsaLimpiezas.getProducts()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros());
        }

        System.out.println("-------------------------------- Lacteo ---------------------------------");

        for (Lacteo prod : bolsaLacteos.getProducts()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad (gr/cc): " + prod.getCantidad());
            System.out.println("Proteinas (gr): " + prod.getProteinas());
        }

        System.out.println("-------------------------------- NoPerecible ---------------------------------");

        for (NoPerecible prod : bolsaNoPerecibles.getProducts()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias (kCal): " + prod.getCalorias());
            System.out.println("Contenido neto (gr): " + prod.getContenido());
        }
    }
}
