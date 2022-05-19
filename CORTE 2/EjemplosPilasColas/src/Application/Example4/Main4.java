package Application.Example4;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main4 {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("Santiago");
        pq.add("Arle");
        pq.add("Mafe");

        System.out.println("Initial queue "+pq);

        pq.remove("Santiago");

        System.out.println("After remove"+ pq);

        System.out.println("Poll method "+pq.poll());

        System.out.println("Final queue "+pq);
    }
}
