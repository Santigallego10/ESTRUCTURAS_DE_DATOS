package co.edu.cue.parcial1.punto4.model;

import java.util.*;

public class University {
    Set<User> users = new HashSet<>();
    List<User> cubiculo1 = new ArrayList<>();
    List<User> cubiculo2 = new ArrayList<>();
    List<User> cubiculo3 = new ArrayList<>();

    int teachersSegment = 0;
    int studentsSegment = 0;

    public University() {
        initializeUsers();
    }

    public void asignTurn() {
        String id = stringInput("Numero de cedula: ");
        User user = findUser(id);

        if (user != null) {
            if (cubiculo1.contains(user) || cubiculo2.contains(user) || cubiculo3.contains(user)) {
                System.out.println("Este usuario ya tiene un turno asignado");
            } else {
                int num = generateRandomNumber();
                addToQueue(num, user);
            }
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    private void initializeUsers() {
        users.add(new User("Santiago", "123456789", "Estudiante"));
        users.add(new User("Pepe", "987654321", "Estudiante"));
        users.add(new User("Arturo", "456987123", "Docente"));
        users.add(new User("Felipe", "159357482", "Docente"));
    }

    public void addToQueue(int num, User user) {
        switch (num) {
            case 1:
                cubiculo1.add(user);
                System.out.println("Cubículo 1\nCédula: " +user.getId()+ "\nSegmento: "+user.getSegment());

                if (user.getSegment().equals("Estudiante")) studentsSegment++;
                else teachersSegment++;
                break;
            case 2:
                cubiculo2.add(user);
                System.out.println("Cubículo 2\nCédula: " +user.getId()+ "\nSegmento: "+user.getSegment());

                if (user.getSegment().equals("Estudiante")) studentsSegment++;
                else teachersSegment++;
                break;
            case 3:
                cubiculo3.add(user);
                System.out.println("Cubículo 3\nCédula: " +user.getId()+ "\nSegmento: "+user.getSegment());

                if (user.getSegment().equals("Estudiante")) studentsSegment++;
                else teachersSegment++;
                break;
        }
    }

    public void getStats() {
        int usersAmount = cubiculo1.size()+cubiculo2.size()+cubiculo3.size();

        System.out.println("Hasta el momento se han atendido: " +usersAmount+ " usuarios" +
                "\nEstudiantes: " +studentsSegment+
                "\nProfesores: " +teachersSegment);
    }

    public int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(3)+1;
    }

    private User findUser(String userId) {
        for (User user: users) {
            if (user.getId().equals(userId)) return user;
        }
        return null;
    }

    private String stringInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
