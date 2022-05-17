package co.edu.cue.stacksAndQueues.example1;

import java.util.LinkedList;
import java.util.Queue;

public class ListaTurno {
    public static void main(String[] args) {
        Queue<String> usuario = new LinkedList<>();
        String[] nombre = {"Juan", "Diego", "lina", "Marcela"};

        for (String item: nombre) {
            usuario.add(item);
        }

        //Display contents of the queue
        System.out.println("Elements of queue: " +usuario);

        //To remove the head of queue
        String removedele = usuario.remove();
        System.out.println("Removed element: " +removedele);

        System.out.println("Elements of queue after deletion: " +usuario);

        //To view the head of the queue
        String head = usuario.peek();
        System.out.println("Head of queue: " +head);

        //Rest all methods of collection
        //Interface like size and contains
        //Can be used with this
        //Implementation
        int size = usuario.size();
        System.out.println("Size of queue- " +size);
    }
}
