package app.application;

import app.entities.User;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users = createUsers();
        boolean flag = true;
        String[] options = {"Exit", "Create auction", "Auctions List"};
        while (flag){

            //main page
            int x = JOptionPane.showOptionDialog(null, "Select an option:",
                    "Click on the option",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            System.out.println(x);

            switch (x){
                case 0:
                    System.out.println("Exit");
                    break;
                case 1:
                    createAuction(users);
                    System.out.println("Create");
                    break;
                case 2:
                    System.out.println("List");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"You need to select a valid option");
            }
        }
    }

    public static List<User> createUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User("Santiago","Gallego","sgallego1022@cue.edu.co","SantiG","1234");
        users.add(user1);
        return users;
    }

    private static void createAuction(List<User> users) {
        User user = logIn(users);

    }

    private static User logIn(List<User> users) {
        User user = null;
        String userName = JOptionPane.showInputDialog("Write your userName:");
        for(User i: users){
            if(i.getUsername().equalsIgnoreCase(userName)){
                return i;
            }else {
                return null;
            }
        }
        return null;
    }
}
