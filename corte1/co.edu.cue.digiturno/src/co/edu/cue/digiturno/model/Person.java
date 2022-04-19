package co.edu.cue.digiturno.model;

import co.edu.cue.digiturno.exceptions.PersonException;

public class Person {
    private String name;
    private String identification;
    private String clientType;
    private String turn = "";

    public Person() {
    }

    public Person(String name, String identification, String clientType) {
        this.name = name;
        this.identification = identification;
        this.clientType = clientType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(int turnNumber) throws PersonException {
        if (!this.turn.equals("")) {
            throw new PersonException("Este cliente ya tiene un turno asignado");
        } else {
            switch (this.clientType) {
                case "Platino":
                    this.turn = "Plat-"+turnNumber;
                    break;
                case "Preferencial":
                    this.turn = "Pref-"+turnNumber;
                    break;
                case "General":
                    this.turn = "G-"+turnNumber;
                    break;
            }
            System.out.println("Turno asignado con éxito\nSu turno es: " +getTurn());
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identification='" + identification + '\'' +
                ", clientType='" + clientType + '\'' +
                ", turn='" + turn + '\'' +
                '}';
    }

}