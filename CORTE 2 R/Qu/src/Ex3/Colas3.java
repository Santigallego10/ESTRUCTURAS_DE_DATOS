package Ex3;

import java.util.PriorityQueue;
import java.util.Queue;

public class Colas3 {
    public static void main(String[] args) {
        Queue<String>pq = new PriorityQueue<>();
        pq.add("Santiago");
        pq.add("Maria");
        pq.add("Monica");

        System.out.println("Initial Queue " + " " + pq);
        pq.remove("Santiago");
        System.out.println("After remove"+ " " +pq);
        System.out.println("Poll method" +" "+pq.poll());
        System.out.println("Final Queue"+" " +pq);

    }
}
