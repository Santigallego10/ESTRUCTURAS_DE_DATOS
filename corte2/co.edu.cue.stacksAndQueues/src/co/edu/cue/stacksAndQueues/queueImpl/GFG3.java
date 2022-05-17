package co.edu.cue.stacksAndQueues.queueImpl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class GFG3 {
    public static void main(String[] args) {
        //Creating empty PriorityBlockingQueue
        Queue<Integer> pbq = new PriorityBlockingQueue<>();

        //Adding items to the pbq
        pbq.add(10);
        pbq.add(20);
        pbq.add(15);

        //Printing the top element of the PriorityBlockingQueue
        System.out.println(pbq.peek());

        //Printing the top element and removing it from the PriorityBlockingQueue container
        System.out.println(pbq.poll());

        //Printing the top element again
        System.out.println(pbq.peek());
    }
}
