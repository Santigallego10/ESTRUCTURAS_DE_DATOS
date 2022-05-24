package ExercisePilas3;

import java.util.*;

import static java.lang.Thread.sleep;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {

        Player playerA = new Player("Player A");
        Player playerB = new Player("Player B");

        int numberAmount = 10;

        for (int j = 0; j < 2; j++) {
            Stack<Integer> queue = new Stack<>();
            for (int i = 0; i < numberAmount; i++) {
                int min = 0;
                int max = 11;
                Random random = new Random();
                int value = random.nextInt(max + min) + min;
                queue.add(value);
            }
            if(j == 0){
                playerA.setDeck(queue);
            }else {
                playerB.setDeck(queue);
            }
        }

        System.out.println("Cartas jugador A: "+playerA.getDeck());
        System.out.println("Cartas jugador B: "+playerB.getDeck());

        // START GAME

        int cont = 1;

        while (!playerA.getDeck().isEmpty() && !playerB.getDeck().isEmpty()){
            int aCard = playerA.getDeck().peek();
            int bCard = playerB.getDeck().firstElement();

            System.out.println("||||||||||------RONDA 1 ------|||||||||");
            System.out.println("......Cartas........");
            System.out.println(playerA.getName() + " ---> "+aCard);
            System.out.println(playerB.getName() + " ---> "+bCard);
            if(aCard > bCard){
                //salida 1
                playerB.setPoints(playerB.getPoints()+1);
                playerB.getDeck().remove(0);
                System.out.println(playerB.getName() + " tiene la carta menor, por lo que elimina la carta y queda con: "+playerB.getDeck().size());
                playerA.getDeck().add(0,playerA.getDeck().pop());

            }else if(aCard<bCard){
                //salida 1
                playerA.setPoints(playerA.getPoints()+1);
                playerA.getDeck().pop();
                System.out.println(playerA.getName() + "Tiene la carta menor, por lo que elimina la carta y queda con: "+playerA.getDeck().size());
                playerB.getDeck().add(0,playerB.getDeck().pop());
            }else if(aCard == bCard){
                playerA.getDeck().pop();
                playerB.getDeck().pop();
            }

            System.out.println("Cartas jugador A: "+playerA.getDeck());
            System.out.println("Cartas jugador B: "+playerB.getDeck());
        }

        System.out.println("||||||||||------ JUEGO TERMINADO ------|||||||||");
        if(playerA.getPoints() > playerB.getPoints()){
            System.out.println("El ganador del juego es "+playerA.getName());
        }else if(playerA.getPoints() < playerB.getPoints()){
            System.out.println("El ganador del juego es "+playerB.getName());
        }else {
            System.out.println("Termina en empate");
        }

        System.out.println("Barajas: ");

        System.out.println(playerA.getDeck());
        System.out.println(playerB.getDeck());





    }
}
