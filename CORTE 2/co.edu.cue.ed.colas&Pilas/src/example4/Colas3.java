package example4;

import java.util.PriorityQueue;
import java.util.Queue;

public class Colas3 {
    public static void main(String[] args) {
        Queue<String> pq=new PriorityQueue<>();
        pq.add("Santiago");
        pq.add("Arle");
        pq.add("Mafe");

        System.out.println("Initial Queue "+pq);

        pq.remove("Santiago");

        System.out.println("After Remove "+ pq);

        System.out.println("Poll Method "+pq.peek());

        System.out.println("Final Queue "+pq);
    }
}
