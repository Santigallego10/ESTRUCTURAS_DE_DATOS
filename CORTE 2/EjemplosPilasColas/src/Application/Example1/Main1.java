package Application.Example1;

import java.util.LinkedList;
import java.util.Queue;

public class Main1 {
    public static void main(String[] args) {
        Queue<String> usuario = new LinkedList<>();
        String[] nombre = {"Juan","Diego","Lina","Marcela"};

        for(String item: nombre){
            usuario.add(item);
        }

        //display content of the queue.
        System.out.println("Elements of the queue "+ usuario);

        //remove head
        String removedele = usuario.remove();
        System.out.println("Removed element-"+removedele);

        System.out.println(usuario);

        //to view the head
        String head = usuario.peek();
        System.out.println("Head of queue-"+ head);

        //rest al methods
        //interface like size and contains
        //can be uses with this
        //implementation.

        int size = usuario.size();
        System.out.println("Size = "+size);


    }
}
