package co.edu.cue.ed.slideshowCollection.model;

public class Publicacion implements Comparable<Publicacion>{

	private String nombrePublicacion;
	private String descripcionPublicacion; 
	private int valor;
	
	public Publicacion(){
		
	}

	public Publicacion(String nombrePublicacion, String descripcionPublicacion, int valor) {
		super();
		this.nombrePublicacion = nombrePublicacion;
		this.descripcionPublicacion = descripcionPublicacion;
		this.valor = valor;
	}

	public String getNombrePublicacion() {
		return nombrePublicacion;
	}

	public void setNombrePublicacion(String nombrePublicacion) {
		this.nombrePublicacion = nombrePublicacion;
	}

	public String getDescripcionPublicacion() {
		return descripcionPublicacion;
	}

	public void setDescripcionPublicacion(String descripcionPublicacion) {
		this.descripcionPublicacion = descripcionPublicacion;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Publicacion [nombrePublicacion=" + nombrePublicacion + ", descripcionPublicacion="
				+ descripcionPublicacion + ", valor=" + valor + "]";
	}
	
	
	@Override
	public int compareTo(Publicacion o) {
		if (this.valor==o.valor) {
			return 0;
		} 
		if (this.valor>o.valor) {
			return 1;
		} else {
			return -1;
		}
	}
	
}