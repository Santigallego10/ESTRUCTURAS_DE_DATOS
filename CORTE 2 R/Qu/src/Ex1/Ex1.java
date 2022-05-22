package Ex1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class Ex1 {
    public static void main(String[] args) {
        Queue<String> user = new LinkedList<>();
        String[] name ={"Lucas ","Milena ", "María ", "Santiago"};

        for (String item : name){
            user.add(item);
            System.out.println("Elements of Queue "+ user);
            String removedele = user.remove();
            System.out.printf("removed element"+removedele);

            System.out.println(user);

            String head = user.peek();
            System.out.println("Head of queue " +head);

            int size = user.size();
            System.out.println("Size of queue" +size);
        }

    }
}
