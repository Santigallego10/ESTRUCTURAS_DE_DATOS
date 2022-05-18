package co.edu.cue.stacksAndQueues.stackEx1;

import java.util.Stack;

public class ProductosInventario {
    public static void main(String[] args) {
        //Creating an empty Stack
        Stack<String> stack = new Stack<>();

        //Use push() to add elements into the Stack
        stack.push("Reloj");
        stack.push("Tetero");
        stack.push("Libro");
        stack.push("Aretes");
        stack.push("Piercing");

        //Displaying the Stack
        System.out.println("Initial Stack: " +stack);

        //Fetching the element at the head of the stack
        System.out.println("The element at the top of the stack is: " +stack.peek());

        //Removing elements using pop() method
        System.out.println("Popped element: " +stack.pop());
        System.out.println("Popped element: " +stack.pop());
    }
}
