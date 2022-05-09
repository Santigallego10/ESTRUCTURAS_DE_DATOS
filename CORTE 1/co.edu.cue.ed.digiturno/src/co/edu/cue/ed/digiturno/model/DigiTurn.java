package co.edu.cue.ed.digiturno.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class DigiTurn {

	
	static ArrayList<Client> listClients= new ArrayList<Client>();
	private static int countGeneral=0;
	private static int countPreferencial=0;
	private static int countPlatinum=0;
	
	public DigiTurn(){
		this.clients();
	}
	
	
	
	private static void clients(){
		
		Client client= new Client();
		client.setIdentification("1785764838");
		client.setName("Maria");
		client.setTypeToClient(TypeClient.GENERAL);
		countGeneral=countGeneral+1;
		client.setContador(countGeneral);
		listClients.add(client);
		
		client= new Client();
		client.setIdentification("6567576876");
		client.setName("Fernanda");
		client.setTypeToClient(TypeClient.PREFERENCIAL);
		countPreferencial=countPreferencial+1;
		client.setContador(countPreferencial);
		listClients.add(client);
		
		
		client= new Client();
		client.setIdentification("9867456436");
		client.setName("Manuela");
		client.setTypeToClient(TypeClient.PLATINUM);
		countPlatinum=countPlatinum+1;
		client.setContador(countPlatinum);
		listClients.add(client);
		
		
		client= new Client();
		client.setIdentification("6567456798");
		client.setName("Santiago");
		client.setTypeToClient(TypeClient.PLATINUM);
		countPlatinum=countPlatinum+1;
		client.setContador(countPlatinum);
		listClients.add(client);

		client= new Client();
		client.setIdentification("3245646579");
		client.setName("Alvaro");
		client.setTypeToClient(TypeClient.PREFERENCIAL);
		countPreferencial=countPreferencial+1;
		client.setContador(countPreferencial);
		listClients.add(client);
		
		
		client= new Client();
		client.setIdentification("6587689789");
		client.setName("Karol");
		client.setTypeToClient(TypeClient.GENERAL);
		countGeneral=countGeneral+1;
		client.setContador(countGeneral);
		listClients.add(client);
		
		
		client= new Client();
		client.setIdentification("1093892839");
		client.setName("Angel");
		client.setTypeToClient(TypeClient.PLATINUM);
		countPlatinum=countPlatinum+1;
		client.setContador(countPlatinum);
		listClients.add(client);
	
		
		client= new Client();
		client.setIdentification("1005876008");
		client.setName("Aymara");
		client.setTypeToClient(TypeClient.PREFERENCIAL);
		countPreferencial=countPreferencial+1;
		client.setContador(countPreferencial);
		listClients.add(client);

		
		client= new Client();
		client.setIdentification("12553251656");
		client.setName("Valentina");
		client.setTypeToClient(TypeClient.PREFERENCIAL);
		countPreferencial=countPreferencial+1;
		client.setContador(countPreferencial);
		listClients.add(client);
	
		
		client= new Client();
		client.setIdentification("452215458747");
		client.setName("Esteban");
		client.setTypeToClient(TypeClient.GENERAL);
		countGeneral=countGeneral+1;
		client.setContador(countGeneral);
		listClients.add(client);
	}
	
	 
	//SHOW CLIENTS
	public void viewClientes(){
		for (Client client : listClients) {
			System.out.println(client);
		}
	}
	
	//SHOW 1 CLIENT
	public Client searchClientIdentification(String identification){
		Client clientExist= null;
		
		for (Client client : listClients) {
			if (client.getIdentification().equalsIgnoreCase(identification)) {
				clientExist=client;
				break;
			}
		}
		return clientExist;
	}
	
	public Client searchClientIdentificationRecursive(String identification, int position){
		if (position<listClients.size()-1) {
			if (listClients.get(position).getIdentification()==identification) {
				return listClients.get(position);
			} else {
				System.out.println(listClients.size());
				return searchClientIdentificationRecursive(identification, position+1);
			}
		}else {
			return null;
		}
	}
	
	
	//SHOW THE TURN
	public void showTurn(String identification){
		
		Client client=searchClientIdentification(identification);
		
		JOptionPane.showMessageDialog(null,"This is your client type: "+client.getTypeToClient());
		
		TypeClient typeClient= client.getTypeToClient();
		JOptionPane.showMessageDialog(null,"Hi, your turn is: ");
		if (typeClient==TypeClient.GENERAL) {
			JOptionPane.showMessageDialog(null,"G"+client.getContador());
		} else if (typeClient==TypeClient.PREFERENCIAL) {
			JOptionPane.showMessageDialog(null,"PR"+client.getContador());
		} else if (typeClient==TypeClient.PLATINUM) {
			JOptionPane.showMessageDialog(null,"PL"+client.getContador());
		}
	}
	
	
	
	
	
	
	
}
