package co.edu.cue.ed.generics.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.edu.cue.ed.generics.model.Ejm1Producto;

public class Ejm1Main {

	public static void main(String[] args) {

		List<Ejm1Producto> productos= new ArrayList<Ejm1Producto>();
		
		productos.add(new Ejm1Producto(1210, "Audifonos", 30));
		Ejm1Producto productoOfertado= productos.iterator().next();
		System.out.println(productoOfertado);
		Ejm1Producto [] productosArreglo= {new Ejm1Producto(1015, "Canasta", 50),
				new Ejm1Producto(1013, "Uniforme", 10), productoOfertado};
		
		Integer[] enterosArreglo= {1,5,8};
		
		
		List<Ejm1Producto> productsList=fromArrayToList(productosArreglo);
		List<Integer> integersList= fromArrayToList(enterosArreglo);
		productsList.forEach(System.out::println);
		
		
		//2
		List<String> nameOffers= fromArrayToList(new String[]{"Andres","Santiago","Maria"},enterosArreglo);

	}
	
	
	
	public static <T> List<T> fromArrayToList(T[] c){
		return Arrays.asList(c);
	}
	
	public static <T,G> List<T> fromArrayToList(T[] c, G[] x){
		for (G elemento : x) {
			System.out.println(elemento);
		}
		for (T elemento2 : c) {
			System.out.println(elemento2);
		}
		return Arrays.asList(c);
	}
	
	
	
	

}