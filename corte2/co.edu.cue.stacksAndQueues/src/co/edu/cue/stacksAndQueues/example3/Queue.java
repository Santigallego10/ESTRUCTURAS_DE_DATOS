package co.edu.cue.stacksAndQueues.example3;

import java.util.ArrayList;

public class Queue<T> {
    //Front and rear variables are initially initialized to -1 pointing to no element
    int front = -1, rear = -1;

    //Create an object of ArrayList class of T type
    ArrayList<T> list = new ArrayList<>();

    //Returns value of the element of the front the queue
    public T front() {
        if (front == -1) return null;
        return list.get(front);
    }

    //Method 2
    //Returns value of the element at the rear of the queue
    public T rear() {
        if (rear == -1) return null;
        return list.get(rear);
    }

    //Inserts element at the front of the queue
    public void enqueue(T x) {
        //If queue is empty
        if (this.empty()) {
            front = 0;
            rear = 0;
        } else {
            front++;
            if (list.size() > front) {
                //Move the front pointer to next
                list.set(front, x);
            } else {
                //Add element to the queue
                list.add(x);
            }
        }
    }

    //Deletes elements from the rear the queue
    public void dequeue() {
        //If queue is empty
        if (this.empty())
            System.out.println("Queue is already empty");
        //If queue has only one element
        else if(front == rear)
            front = rear = -1;
        //If queue has more than one element
        else
            rear++;
    }

    //Check whether the queue is empty
    private boolean empty() {
        if (front == -1 && rear == -1)
            return true;
        return false;
    }

    @Override
    public String toString() {
        if (this.empty())
            return "[]";

        String ans = "";

        for (int i=rear; i<front; i++) {
            ans += String.valueOf(list.get(i)) + "->";
        }
        ans += String.valueOf(list.get(front));
        return ans;
    }
}
