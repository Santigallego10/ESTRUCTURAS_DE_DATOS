package ExercisePilas3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Player {

    private String name;
    private int points;
    private Stack<Integer> deck;

    public Player(){
    }

    public Player(String name) {
        this.points = 0;
        this.name = name;
        this.deck = new Stack<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Integer> getDeck() {
        return deck;
    }

    public void setDeck(Stack<Integer> deck) {
        this.deck = deck;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
