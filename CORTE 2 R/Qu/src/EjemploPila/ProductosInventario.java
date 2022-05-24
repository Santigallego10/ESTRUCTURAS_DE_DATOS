package EjemploPila;

import java.util.Stack;

public class ProductosInventario {
    public static void main(String[] args) {
        //creating an empty stack
        Stack<String> stack = new Stack<String>();

        //use push() to add elements into the stack
        stack.push("Reloj");
        stack.push("Tetero");
        stack.push("Libro");
        stack.push("Aretes");
        stack.push("Piercing");
        //Displaying the stack
        System.out.println("Initial stack "+stack);

        //Fetching the element of the head of the stack
        System.out.println("The element at the top of the stack is "+ stack.peek());

        //removing elements using pop()

        System.out.println("Popped element "+stack.pop());
        System.out.println("Popped element "+stack.pop());

        System.out.println("Initial stack "+stack);

    }
}
