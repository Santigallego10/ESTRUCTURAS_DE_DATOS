package co.edu.cue.stacksAndQueues.queueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class GFG2 {
    public static void main(String[] args) {
        //Creating empty LinkedList
        Queue<Integer> ll = new LinkedList<>();

        //Adding items to the ll
        ll.add(10);
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        ll.add(16);

        //Printing the top element of the LinkedList
        System.out.println(ll.peek());

        //Printing the top element and removing it from the LinkedList container
        System.out.println(ll.poll());

        //Printing the top element again
        System.out.println(ll.peek());
    }
}
