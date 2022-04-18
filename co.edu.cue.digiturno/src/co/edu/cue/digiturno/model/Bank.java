package co.edu.cue.digiturno.model;

import co.edu.cue.digiturno.exceptions.PersonException;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Person> clientsList = new ArrayList<>();
    private int platinumAmount = 0;
    private int preferentialAmount = 0;
    private int generalAmount = 0;

    public Bank() {
        loadClients();
    }

    private void loadClients() {
        clientsList.add(new Person("Santiago", "123456789", "Platino"));
        clientsList.add(new Person("Felipe", "987654321", "Platino"));
        clientsList.add(new Person("Beatriz", "123789456", "Platino"));
        clientsList.add(new Person("Amparo", "789123654", "Platino"));
        clientsList.add(new Person("Arle", "159357654", "Preferencial"));
        clientsList.add(new Person("Maria Fernanda", "357159729", "Preferencial"));
        clientsList.add(new Person("Pepe", "381729654", "Preferencial"));
        clientsList.add(new Person("Antonio", "651478920", "General"));
        clientsList.add(new Person("Valentina", "984123657", "General"));
        clientsList.add(new Person("Mariana", "102589741", "General"));
    }

    public Person searchClient(String identification, int itr) {
        if (itr != clientsList.size()) {
            if (identification.equals( clientsList.get(itr).getIdentification() )) {
                return clientsList.get(itr);
            } else {
                return searchClient(identification, itr+1);
            }
        }
        return null;
    }

    public String searchTurn(String identification, int itr) {
        if (itr != clientsList.size()) {
            if (identification.equals( clientsList.get(itr).getIdentification() )) {
                if (!clientsList.get(itr).getTurn().equals(""))
                    return clientsList.get(itr).getTurn();
            } else {
                return searchTurn(identification, itr+1);
            }
        }
        return null;
    }

    public void setTurnNumber(Person client) {
        switch(client.getClientType()) {
            case "Platino":
                try {
                    this.platinumAmount++;
                    client.setTurn(this.platinumAmount);
                } catch (Exception e) {
                    this.platinumAmount--;
                    System.out.println(e.getMessage());
                }
                break;
            case "Preferencial":
                try {
                    this.preferentialAmount++;
                    client.setTurn(this.preferentialAmount);
                } catch (Exception e) {
                    this.preferentialAmount--;
                    System.out.println(e.getMessage());
                }
                break;
            case "General":
                try {
                    this.generalAmount++;
                    client.setTurn(this.generalAmount);
                } catch (Exception e) {
                    this.generalAmount--;
                    System.out.println(e.getMessage());
                }
                break;
        }
    }

    public void showTurnNumbers() {
        System.out.println("Platino: " +this.platinumAmount+
                "\nPreferencial: " +this.preferentialAmount+
                "\nGeneral: " +this.generalAmount);
    }

    public List<Person> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Person> clientsList) {
        this.clientsList = clientsList;
    }

    public int getPlatinumAmount() {
        return platinumAmount;
    }

    public void setPlatinumAmount(int platinumAmount) {
        this.platinumAmount = platinumAmount;
    }

    public int getPreferentialAmount() {
        return preferentialAmount;
    }

    public void setPreferentialAmount(int preferentialAmount) {
        this.preferentialAmount = preferentialAmount;
    }

    public int getGeneralAmount() {
        return generalAmount;
    }

    public void setGeneralAmount(int generalAmount) {
        this.generalAmount = generalAmount;
    }

}