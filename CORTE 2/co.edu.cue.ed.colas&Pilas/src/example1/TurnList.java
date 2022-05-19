package example1;

import java.util.LinkedList;
import java.util.Queue;

public class TurnList {
    public static void main(String[] args) {

        Queue<String> user= new LinkedList<>();
        String[] name= {"Juan", "Diego","Lina","Marcela"};

        for (String item:name) {
            user.add(item);
        }

        System.out.println("Elements of queue: "+user);


        String removedele=user.remove();
        System.out.println("Remove element: "+removedele);


        System.out.println(user);


        String head= user.peek();
        System.out.println("Head of queue- "+head);



        int size= user.size();
        System.out.println("Size of queue- "+size);

    }
}
