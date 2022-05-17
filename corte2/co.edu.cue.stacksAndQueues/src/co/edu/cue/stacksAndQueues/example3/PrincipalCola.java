package co.edu.cue.stacksAndQueues.example3;

public class PrincipalCola {
    public static void main(String[] args) {
        //Creating object of queue class (defined by us)
        Queue<Integer> q = new Queue<>();

        //Inserting the elements into the queue
        q.enqueue(10);
        q.enqueue(124);
        q.enqueue(27);
        q.enqueue(18);
        q.enqueue(28);

        //Print the queue after inserting integer elements
        System.out.println("After enqueue of elements:\n" +q);
        q.dequeue();
        System.out.println("After dequeue:\n" +q);

        //Declaring the object of type String
        Queue<String> q1 = new Queue<>();

        //Inserting elements in the queue
        q1.enqueue("Mouse");
        q1.enqueue("Teclado");
        q1.enqueue("Monitor");

        //Print the queue after enqueuing
        System.out.println("\nAfter enqueue of elements:\n" +q1);

        //Printing
        System.out.println("q1 front=" +q1.front()+ ", q1 rear=" +q1.rear());
    }
}
