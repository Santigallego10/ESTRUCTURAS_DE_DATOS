package Entities;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static Entities.TypeOf.*;

public class Turn {

    public static void main(String[] args) {

        ArrayList<Clients> clients = new ArrayList<>();

        ArrayList<String>generalTurn = new ArrayList<>();

        ArrayList<String>platinumTurn = new ArrayList<>();

        ArrayList<String>preferentialTurn = new ArrayList<>();

        Clients client = new Clients("María Fernanda Hurtado","1090272355",PLATINUM);
        clients.add(client);

        Clients client2 = new Clients("Ivan Hurtado","18494181", GENERAL);
        clients.add(client2);

        Clients client3 = new Clients("Luz Gomez","24675275",PREFERENTIAL);
        clients.add(client3);

        Clients client4 = new Clients("María Fernanda Lopez","1092278395",PLATINUM);
        clients.add(client4);

        Clients client5 = new Clients("Alvaro Fernando Marin","123456666",PLATINUM);
        clients.add(client5);

        Clients client6 = new Clients("Santiago Gallego","10034778863", GENERAL);
        clients.add(client6);

        Clients client7 = new Clients("Santiago Jaramillo","9872992", GENERAL);
        clients.add(client7);

        Clients client8 = new Clients("Luciana Gomez","97q817818",PREFERENTIAL);
        clients.add(client8);

        Clients client9 = new Clients("Martín Moreno","800907798",PREFERENTIAL);
        clients.add(client9);

       Boolean turn = true;
       String M ="Pls write the option that u want: \n"+
               "1.Request a shift \n"+
               "2. Show me the turn list ";

       while(turn){
           String op= JOptionPane.showInputDialog(M);
           switch (op){
               case "1":
                   String id= JOptionPane.showInputDialog("enter your id");
                   Clients searchClient = searchClient(clients,id,0);
                   list(searchClient,platinumTurn,generalTurn,preferentialTurn);
                   break;

               case "2":
                   array(platinumTurn,"this is the list of platinum turn");
                   array(generalTurn,"this is the list of preferential turn");
                   array(preferentialTurn,"this is the list of general turn");


           }
       }

    }
    private static void array (ArrayList<String>list, String name){
        String msj="";
        for(int i=0;i<list.size();i++){
            msj += list.get(i)+".";
        }
        JOptionPane.showMessageDialog(null,msj,name,JOptionPane.INFORMATION_MESSAGE);
    }

    public static void list(Clients searchClient, ArrayList<String>platinumTurn,ArrayList<String>generalTurn, ArrayList<String>preferentialTurn){
        TypeOf typeof = (TypeOf) searchClient.getTypeOf();
        switch (typeof){
            case PREFERENTIAL :
                int sizePreferential = preferentialTurn.size();
                String P = ""+(sizePreferential);
                preferentialTurn.add(P);
                JOptionPane.showMessageDialog(null, "your turn is: " +P);
                break;

            case PLATINUM:
                int sizePlatinum = platinumTurn.size();
                String PL = ""+(sizePlatinum);
                preferentialTurn.add(PL);
                JOptionPane.showMessageDialog(null, "your turn is: " +PL);
                break;

            case GENERAL:
                int sizeGeneral = generalTurn.size();
                String G = ""+(sizeGeneral);
                preferentialTurn.add(G);
                JOptionPane.showMessageDialog(null, "your turn is: " +G);
                break;

            default:
                break;
        }

    }

    private static Clients searchClient(ArrayList<Clients>clients,String id,int c ){
        if(c>=clients.size()-1){
            return  null;
        }
        if(clients.get(c).getId().equalsIgnoreCase(id)){
            return clients.get(c);

        }else{
            return searchClient(clients,id,c+1);
        }
    }
}
