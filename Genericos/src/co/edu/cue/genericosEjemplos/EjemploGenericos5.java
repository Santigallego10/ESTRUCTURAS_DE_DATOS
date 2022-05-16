package co.edu.cue.genericosEjemplos;

import java.util.List;

import static co.edu.cue.genericosEjemplos.EjemploGenericos2.fromArrayToList;

public class EjemploGenericos5 {
    public static void main(String[] args) {
        ProductoEjemplo1[] productosArreglo = {new ProductoEjemplo1(1015,"Canasta",50),new ProductoEjemplo1(1013, "uniforme", 10 )};
        List<ProductoEjemplo1> productosLista = fromArrayToList(productosArreglo);
        System.out.println("productos generales");
        imprimirProductos(productosLista);

        List<ProductoDestacado> listaProdestacados = fromArrayToList(new ProductoDestacado[]{new ProductoDestacado(1014,"maletin",150,"vendido")});
        System.out.println("Productos destacados");
        imprimirProductos(listaProdestacados);

    }

    public static void  imprimirProductos(List<? extends  ProductoEjemplo1> productos){
        productos.forEach(System.out::println);
    }

}
