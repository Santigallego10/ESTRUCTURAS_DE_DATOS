package example3;

public class PrincipalCola {
    public static void main(String[] args) {
        queue<Integer> q= new queue<>();

        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);

        System.out.println("after enqueue of elements :\n "+q);
        q.dequeue();
        System.out.println("after dequeue :\n "+q);

        queue<String > q1= new queue<>();

        q1.enqueue("Mouse");
        q1.enqueue("Teclado");
        q1.enqueue("Monitor");

        System.out.println("\n after enqueue of elements:\n"+q1);


        System.out.println("q1 front = "+q1.front()+ ", q1 rear = "+ q1.rear());
    }
}