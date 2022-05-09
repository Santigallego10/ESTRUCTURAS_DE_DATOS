package co.edu.cue.ed.digiturno.model;


public class Client {

	
	private String identification;
	private String name;
	private TypeClient typeToClient;
	private int contador;
		
	
	public Client(){
		
	}
	
	
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeClient getTypeToClient() {
		return typeToClient;
	}

	public void setTypeToClient(TypeClient typeToClient) {
		this.typeToClient = typeToClient;
	}


	public int getContador() {
		return contador;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}


	@Override
	public String toString() {
		return "Client: "
				+ "identification=" + identification 
				+ ", name=" + name 
				+ ", typeToClient=" + typeToClient;
	}
	
	
	
}
