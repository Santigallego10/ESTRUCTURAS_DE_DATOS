package Ex4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static Ex4.TypeOf.STUDENT;
import static Ex4.TypeOf.TEACHER;

public class Oficina {

    public static void main(String[] args) {

        List<Users> userList = new ArrayList<>();

        ArrayList<String>teachersTurn = new ArrayList<>();

        ArrayList<String>studentsTurn = new ArrayList<>();


        Users user = new Users("María Fernanda Hurtado", "1090272355", STUDENT);
        userList.add(user);

        Users user1 = new Users("Monica", "109809990", TEACHER);
        userList.add(user1);

        Users user2 = new Users("Mariana", "1245678", STUDENT);
        userList.add(user2);

        Users user3 = new Users("Ulises", "1789927899", TEACHER);
        userList.add(user3);

        Users user4 = new Users("Marina", "17i2782897", STUDENT);
        userList.add(user4);

        Users user5 = new Users("Milena", "416717189", TEACHER);
        userList.add(user5);

        Users user6 = new Users("Marta", "18918919", STUDENT);
        userList.add(user6);

        Users user7 = new Users("Santiago", "17177178", TEACHER);
        userList.add(user7);

        Boolean turn = true;
        String option = "Pls write the option that u want: \n" +
                "1.Request a shift \n" +
                "2. Show me the turn list \n" +
                "3. Change the module";

        while (turn) {
            String op = JOptionPane.showInputDialog(option);
            switch (op) {
                case "1":
                    String id = JOptionPane.showInputDialog("enter your id");
                    Users searchClient = searchClient (userList, id, 0);
                    list(searchClient, studentsTurn, teachersTurn);
                    break;

                case "2":
                    showArray(studentsTurn, "this is the students list");
                    showArray(teachersTurn, "this is the teachers list");


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

    public static void list(Users searchClient, ArrayList<String> studentsTurn, ArrayList<String> teachersTurn) {
        TypeOf typeof = (TypeOf) searchClient.getTypeOf();
        switch (typeof) {
            case STUDENT:
                int sizeStudent = studentsTurn.size();
                String P = "Estudiantes: " + (sizeStudent);
                studentsTurn.add(P);
                JOptionPane.showMessageDialog(null, "Student, your turn is: " + " " + "E");
                System.out.println("La cantida de turnos de estudiantes es: " + sizeStudent);
                break;

            case TEACHER:
                int sizeTeacher = teachersTurn.size();
                String PL = "" + (sizeTeacher);
                studentsTurn.add(PL);
                JOptionPane.showMessageDialog(null, "your turn is: " + PL);
                System.out.println("la cantidad de turnos de profesores" + sizeTeacher);
                break;

            default:
                break;

        }

    }
    private static Users searchClient(List<Users> userList, String id, int c ) {
        if (c >= userList.size() - 1) {
            return null;
        }
        if (userList.get(c).getId().equalsIgnoreCase(id)) {
            return userList.get(c);

        } else {
            return searchClient(userList, id, c + 1);
        }
    }

   
}
