package Application.Example3;

import java.util.ArrayList;

public class queue<T>{

    int front = -1, rear=-1;

    ArrayList<T> list = new ArrayList<>();

    public T front(){
        if(front == -1){
            return null;
        }
        return list.get(front);
    }

    public void enqueue(T x){
        if(this.empty()){
            front = 0;
            rear = 0;
            list.add(x);
        }else {
            front++;
            if(list.size() > front){
                list.set(front, x);
            }else {
                list.add(x);
            }
        }
    }

    public void dequeue(){

        if(this.empty()){

            System.out.println("Queue is already empty");
        }else  if (front == rear){
            front = rear = -1;
        }else {
            rear++;
        }
    }

    private boolean empty() {
        if(front == -1 && rear == -1){
            return true;
        }
        return false;
    }

    public String toString(){
        if (this.empty()){
            return "";
        }

        String ans = "";

        for (int i = rear; i < front; i++) {
            ans += String.valueOf(list.get(i)) + "->";
        }

        ans += String.valueOf(list.get(front));

        return ans;
    }

    public T rear() {
        if(rear == -1){
            return null;
        }
        return list.get(rear);
    }
}
