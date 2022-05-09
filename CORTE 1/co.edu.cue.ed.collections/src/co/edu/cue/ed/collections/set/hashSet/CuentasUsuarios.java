package co.edu.cue.ed.collections.set.hashSet;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CuentasUsuarios {
    public static void main(String[] args) {
        Client cl1 = new Client("Antonio Banderas", "00001", 200000);
        Client cl2 = new Client("Rafael Nadal", "00002", 250000);
        Client cl3 = new Client("Penelope Cruz", "00003", 300000);
        Client cl4 = new Client("Julio Iglesias", "00004", 500000);
        Client cl5 = new Client("Julio Iglesias", "00004", 500000);

        Set<Client> clients = new HashSet<>();

        clients.add(cl1);
        clients.add(cl2);
        clients.add(cl3);
        clients.add(cl4);
        clients.add(cl5);

        System.out.println(cl4.hashCode());
        System.out.println(cl5.hashCode());

        for (Client client : clients) {
            System.out.println(client);
            System.out.println(client.hashCode());
        }

        Object[] clientsList = clients.toArray();

        System.out.println("Objeto en la posición 2:");
        System.out.println(clientsList[2].toString());

        //clients.
    }
}
