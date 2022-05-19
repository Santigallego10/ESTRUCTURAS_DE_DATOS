package Application.Example2;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args)
    {
        Queue<Anuncio> pq = new LinkedList<>();

        pq.add(new Anuncio("Gafas","De sol",30));
        pq.add(new Anuncio("Toalla","Hello Kitty",30));
        pq.add(new Anuncio("Perro","Negro",30));

        System.out.println(pq);

        System.out.println("-------------------");
        pq.remove();
        System.out.println(pq);

        System.out.println("-------------------");
        System.out.println(pq.peek());

    }
}
