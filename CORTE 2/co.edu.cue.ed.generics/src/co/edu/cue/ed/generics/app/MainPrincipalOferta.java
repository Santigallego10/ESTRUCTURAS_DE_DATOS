package co.edu.cue.ed.generics.app;

import co.edu.cue.ed.generics.model.Ejm1Producto;
import co.edu.cue.ed.generics.model.Oferta;
import co.edu.cue.ed.generics.model.ProductoDestacado;

public class MainPrincipalOferta {

	public static <T> void imprimirOfertas(Oferta<T> subasta){
		for (T t : subasta) {
			System.out.println(t.toString());
		}
	}
	
	public static void main(String[] args) {
		Oferta<Ejm1Producto> subasta= new Oferta<>(5);
		subasta.add(new Ejm1Producto(1234, "Celular", 400));
		subasta.add(new Ejm1Producto(1212, "Gafas", 100));
		subasta.add(new Ejm1Producto(1213, "Reloj", 120));
		subasta.add(new Ejm1Producto(1232, "Lapicero", 20));
		subasta.add(new ProductoDestacado(1232, "Pc", 2000,"Agotado"));
		
		imprimirOfertas(subasta);
		subasta.add(new Ejm1Producto(1214, "Vestido", 300));
		System.out.println("---------------------------");
		imprimirOfertas(subasta);
		
		
		
	}

}
