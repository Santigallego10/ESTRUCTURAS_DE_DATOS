package Application.Example5;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main5 {
    public static void main(String[] args) {
        Queue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());

        System.out.println(pQueue.peek());
    }
}
