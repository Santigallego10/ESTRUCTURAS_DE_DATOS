package co.edu.cue.ed.generics.model;

public class ProductoDestacado extends Ejm1Producto {

	private String estadoDestacado;
	

	public ProductoDestacado(int code, String name, float saleValue, String estadoDestacado) {
		super(code, name, saleValue);
		this.estadoDestacado = estadoDestacado;
	}


	public String getEstadoDestacado() {
		return estadoDestacado;
	}


	public void setEstadoDestacado(String estadoDestacado) {
		this.estadoDestacado = estadoDestacado;
	}


	@Override
	public String toString() {
		return "ProductoDestacado [estadoDestacado=" + estadoDestacado + "]";
	}

	
	
	
	
}
