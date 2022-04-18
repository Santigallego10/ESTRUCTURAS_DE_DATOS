package co.edu.cue.DigiTurno;

import co.edu.cue.DigiTurno.Entities.Client;

import javax.swing.*;
import java.util.ArrayList;

import static co.edu.cue.DigiTurno.Types.*;

public class Main {
    public static void main(String[] args) {
        //Clients//
        ArrayList<Client> clientList = new ArrayList<>();
        ArrayList<String> generalList = new ArrayList<>();
        ArrayList<String> platinumList = new ArrayList<>();
        ArrayList<String> preferentialList = new ArrayList<>();

        Client myClient = new Client("Santiago Gallego","1004961630",GENERAL);
        Client myClient2 = new Client("Maria Fernanda Hurtado","1004567834",PLATINUM);
        Client myClient3 = new Client("Santiago Jaramillo Lopez","10046758976",GENERAL);
        Client myClient4 = new Client("Alvaro Fernando Marin","1076489203",PLATINUM);
        Client myClient5 = new Client("Maria Fernanda Lopez","1004878394",PREFERENTIAL);
        Client myClient6 = new Client("Katherine Gil Arias","1094886741",GENERAL);
        Client myClient7 = new Client("Oscar Perez","91092939",PLATINUM);
        Client myClient8 = new Client("Mariana Arias","4657830333",GENERAL);
        Client myClient9 = new Client("Andres Gil","10948220",PLATINUM);
        Client myClient10 = new Client("Maria Teresa Arias","81920033",GENERAL);
        clientList.add(myClient);
        clientList.add(myClient2);
        clientList.add(myClient3);
        clientList.add(myClient4);
        clientList.add(myClient5);
        clientList.add(myClient6);
        clientList.add(myClient7);
        clientList.add(myClient8);
        clientList.add(myClient9);
        clientList.add(myClient10);

        //menu//
        Boolean flag = true;
        String message = "Ingrese el numero segun lo que desee hacer: \n" +
                "1.Solicitar turno \n" +
                "2.Ver lista de espera";

        while(flag){
            String option = JOptionPane.showInputDialog(message);
            switch (option){
                case "1":
                    String id = JOptionPane.showInputDialog("Imgrese su numero de cedula");
                    Client findedClient = findClient(clientList,id,0);
                    joinList(findedClient, platinumList, generalList, preferentialList);
                    break;

                case "2":
                    showArray(platinumList, "Lista de espera Platino");
                    showArray(generalList, "Lista de espera General");
                    showArray(preferentialList, "Lista de espera Preferencial");
            }
        }

    }

    private static void showArray(ArrayList<String> list, String name) {
        String message = "";
        for(int i = 0; i < list.size(); i++) {
            message += list.get(i)+", ";
        }
        JOptionPane.showMessageDialog(null, message, name, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void joinList(Client findedClient, ArrayList<String> platinumList, ArrayList<String> generalList, ArrayList<String> preferentialList) {
        Types type = (Types) findedClient.getTypes();
        switch (type){
            case GENERAL:
                int sizeG = generalList.size();
                String turnG = "G"+(sizeG++);
                generalList.add(turnG);
                JOptionPane.showMessageDialog(null,"Su turno asignado es: "+turnG);
                break;

            case PLATINUM:
                int sizeP = platinumList.size();
                String turnP = "P"+(sizeP++);
                platinumList.add(turnP);
                JOptionPane.showMessageDialog(null,"Su turno asignado es: "+turnP);
                break;

            case PREFERENTIAL:
                int sizePN = preferentialList.size();
                String turnPN = "P"+(sizePN++);
                JOptionPane.showMessageDialog(null,"Su turno asignado es: "+turnPN);
                break;

            default:
                break;

        }
    }

    private static Client findClient(ArrayList<Client> clientList, String id, int c) {
        if(c >= clientList.size()-1){
            return null;
        }
        if(clientList.get(c).getId().equalsIgnoreCase(id)){
            return clientList.get(c);
        }else{
            return findClient(clientList,id,c + 1);
        }
    }

    }