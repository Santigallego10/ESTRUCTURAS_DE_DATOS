package example7Pila;

import java.util.Stack;

public class ProductoInventario {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Reloj");
        stack.push("Tetero");
        stack.push("Libro");
        stack.push("Aretes");
        stack.push("Piercing");

        System.out.println("Initial Stack: "+stack);

        System.out.println("The element at the top of the stack is: "+stack.peek());

        System.out.println("Popped element: "+ stack.pop());

        System.out.println("Popped element: "+stack.pop());
        System.out.println("Popped element: "+stack.pop());
        System.out.println("Popped element: "+stack.pop());
        System.out.println("Popped element: "+stack.pop());
    }
}
