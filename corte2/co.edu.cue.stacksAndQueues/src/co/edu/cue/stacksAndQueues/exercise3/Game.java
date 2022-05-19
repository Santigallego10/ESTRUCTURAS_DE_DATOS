package co.edu.cue.stacksAndQueues.exercise3;

import java.util.*;
import java.util.stream.Collector;

public class Game {
    private Queue<Integer> A = new LinkedList<>();
    private Stack<Integer> B = new Stack<>();
    private List<Integer> results = new ArrayList<>();

    public Game() {
        fillCollection(A, 7);
        fillCollection(B, 10);
    }

    private void fillCollection(Collection<Integer> col, int num) {
        for (int i = 0; i < num; i++) {
            col.add(generateRandomNumber());
        }
    }

    public void playGame() {
        while (!(A.isEmpty() || B.isEmpty())) {
            if (A.peek() > B.peek()) {
                results.add(1);
                B.pop();
            }
            else if (B.peek() > A.peek()) {
                results.add(2);
                A.poll();
            }
            else if (A.peek() == B.peek()) {
                results.add(0);
                A.poll();
                B.pop();
            }
        }
    }

    public void winner() {
        int winsA = 0, winsB = 0, draws = 0;

        for (Integer num: results) {
            if (num == 1) winsA++;
            else if (num == 2) winsB++;
            else if (num == 0) draws++;
        }

        if (winsA > winsB && winsA > draws)
            System.out.println("A es el ganador!!");
        else if (winsB > winsA && winsB > draws)
            System.out.println("B es el ganador!!");
        else if (draws > winsA && draws > winsB)
            System.out.println("Es un empate!!");
    }

    public void showLists() {
        System.out.println(
            "------- Estado inicial -------\n" +
            "A: " +A.toString()+ "\n" +
            "B: " +B.toString()
        );
    }

    public void showResults() {
        System.out.println("------- Resultados -------\n" +results.toString());
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(11);
    }
}
