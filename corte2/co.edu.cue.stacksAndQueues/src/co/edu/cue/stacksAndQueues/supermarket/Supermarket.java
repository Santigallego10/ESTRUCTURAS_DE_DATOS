package co.edu.cue.stacksAndQueues.supermarket;

import java.util.*;

public class Supermarket {
    Queue<Client> q1 = new LinkedList<>();
    Queue<Client> q2 = new LinkedList<>();
    Queue<Client> q3 = new LinkedList<>();
    Set<Client> clients = new HashSet<>();

    private int karts;

    public Supermarket() {
        this.karts = 15;
    }

    public void getKart() {
        if (this.karts == 0) {
            System.out.println("No hay carritos disponibles, espere a que se libere uno");
        } else {
            if (register()) {
                this.karts--;
                System.out.println("Bienvenido!!\nCarritos disponibles: " +this.karts);
            } else {
                System.out.println("Ya hay un cliente registrado con esta identificación");
            }
        }
    }

    private boolean register() {
        String name = stringInput("Ingrese su nombre: ");
        String id = stringInput("Ingrese su identificación: ");
        int sizeBefore = clients.size();

        clients.add(new Client(name, id));
        return clientExists(sizeBefore, clients.size());
    }

    private boolean clientExists(int sizeBef, int sizeAft) {
        return sizeBef != sizeAft;
    }

    public void goToQueue() {
        Client client = findClient();

        if (client != null) {
            int shortestQueue = findShortestQueue();

            switch (shortestQueue) {
                case 1:
                    q1.add(client);
                    clients.remove(client);
                    System.out.println("Se ha agregado a " +client.getName()+ " a la fila 1");
                    break;
                case 2:
                    q2.add(client);
                    clients.remove(client);
                    System.out.println("Se ha agregado a " +client.getName()+ " a la fila 2");
                    break;
                case 3:
                    q3.add(client);
                    clients.remove(client);
                    System.out.println("Se ha agregado a " +client.getName()+ " a la fila 3");
                    break;
            }
        } else {
            System.out.println("No hay un cliente con este numero de identificación o ya está haciendo fila");
        }
    }

    private int findShortestQueue() {
        if (q1.size() < q2.size() && q1.size() < q3.size()) {
            return 1;
        }
        else if (q2.size() < q1.size() && q2.size() < q3.size()) {
            return 2;
        }
        else if (q3.size() < q1.size() && q3.size() < q2.size()) {
            return 3;
        }
        else if (q1.size() == q2.size()) {
            return 1;
        }
        else if (q2.size() == q3.size()) {
            return 2;
        }
        return 3;
    }

    private Client findClient() {
        String id = stringInput("Numero de identificación: ");

        for (Client client: clients) {
            if (client.getId().equals(id)) return client;
        }
        return null;
    }

    public void checkoutFromQueue() {
        String option = stringInput("Seleccione la fila que se evacuará: ");
        Client client;

        switch (option) {
            case "1":
                client = findClient(q1);
                checkoutIfContained(q1, client, 1);
                break;
            case "2":
                client = findClient(q2);
                checkoutIfContained(q2, client, 2);
                break;
            case "3":
                client = findClient(q3);
                checkoutIfContained(q3, client, 3);
                break;
            default:
                System.out.println("La fila indicada no existe");
                break;
        }
    }

    private Client findClient(Queue<Client> queue) {
        String id = stringInput("Numero de identificación: ");

        for (Client client: queue) {
            if (client.getId().equals(id)) return client;
        }
        return null;
    }

    private void checkoutIfContained(Queue<Client> queue, Client client, int queueNum) {
        if (queue.contains(client)) {
            if (queue.peek().equals(client)) {
                queue.poll();
                this.karts++;
                System.out.println(client.getName()+ " ha pagado y salido de la fila " +queueNum);
            } else {
                System.out.println("Este cliente está en la fila pero aún no es su turno de pagar");
            }
        } else {
            System.out.println("Este cliente no se encuentra en esta fila, revise en otras");
        }
    }

    public void showQueues() {
        System.out.println(
                "Fila 1: " +q1+ "\n" +
                "Fila 2: " +q2+ "\n" +
                "Fila 3: " +q3+ "\n" +
                "Carritos disponibles: " +this.karts
        );
    }

    private String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextLine();
    }

    public int getKarts() {
        return karts;
    }

    public void setKarts(int karts) {
        this.karts = karts;
    }
}
