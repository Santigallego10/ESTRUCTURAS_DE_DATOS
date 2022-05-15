package co.edu.cue.ed.generics.app;

import java.util.Arrays;
import java.util.List;

import co.edu.cue.ed.generics.model.Ejm1Producto;
import co.edu.cue.ed.generics.model.ProductoDestacado;

public class Ejm4Main {

	public static void main(String[] args) {
		Ejm1Producto [] productosArreglo= {new Ejm1Producto(1015, "Canasta", 50),
				new Ejm1Producto(1013, "Uniforme", 10)};
		
		List<Ejm1Producto> productsList=fromArrayToList(productosArreglo);
		System.out.println("Productos generales");
		imprimirProductos(productsList);
		
		
		List<ProductoDestacado> listaProDestacados= fromArrayToList(
				new ProductoDestacado[]{new ProductoDestacado(1014, "maletin", 150, "vendido")});
		
		System.out.println("Productos Destacados");
		imprimirProductos(listaProDestacados);
		
	}
	
	public static void imprimirProductos(List <? extends Ejm1Producto> productos){
		productos.forEach(System.out::println);
	}
	
	
	public static <T> List<T> fromArrayToList(T[] c){
		return Arrays.asList(c);
	}

}
