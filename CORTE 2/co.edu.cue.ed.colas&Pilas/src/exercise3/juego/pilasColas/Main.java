package exercise3.juego.pilasColas;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> A = new LinkedList<Integer>();
        Stack<Integer> B = new Stack<Integer>();

        List<Integer> listOf1A = new ArrayList<>();
        List<Integer> listOf2B = new ArrayList<>();
        List<Integer> listOfSameElements0 = new ArrayList<>();
        List<Integer> listOfValuesA = new ArrayList<>();
        List<Integer> listOfValuesB= new ArrayList<>();

        B.add(8); B.add(4); B.add(9); B.add(4);
        A.add(3); A.add(5); A.add(8); A.add(2);


        System.out.println("Elements A: "+A);
        System.out.println("Elements B: "+B);

        //if (!A.isEmpty() && !B.isEmpty()) {
            for (int i = 0; i < B.size()+3; i++) {

                Integer firstElementA= A.peek();
                A.remove();
                Integer firstElementB= B.pop();

                if (firstElementA > firstElementB){
                    listOf1A.add(1);
                    listOfValuesA.add(firstElementA);
                    //A.remove();
                } else if (firstElementB>firstElementA){
                    listOf2B.add(2);
                    listOfValuesB.add(firstElementB);
                } else {
                    listOfSameElements0.add(0);
                    //A.remove();
                }
                }

       // }
        System.out.println("\n");
        System.out.println("Lista de 1A: "+listOf1A);
        System.out.println("Lista de 2B: "+listOf2B);
        System.out.println("Lista de 0AB: "+listOfSameElements0);
        System.out.println("Lista de valores de A guardados: "+listOfValuesA);
        System.out.println("Lista de valores de B guardados: "+listOfValuesB);


        if (listOf2B.size()>listOf1A.size()) {
            System.out.println("El jugador B es el ganador");
        } else  if (listOf2B.size()<listOf1A.size()) {
            System.out.println("El jugador A es el ganador");
        } else {
            System.out.println("Esto es un empate");
        }
    }
}

