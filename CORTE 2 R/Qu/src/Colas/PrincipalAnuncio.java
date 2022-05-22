package Colas;

import java.util.LinkedList;
import java.util.Queue;

public class PrincipalAnuncio {
    public static void main(String[] args) {
        Queue<Anuncio> pq = new LinkedList<>();

        pq.add(new Anuncio("Gafas", "de sol", 30));
        pq.add(new Anuncio("Lampara ", "De mesa", 50));
        pq.add(new Anuncio("Botas","Vaqueras",80 ));
        pq.add(new Anuncio("Botas", "Vaqueras", 120));

        System.out.println("-------------------");
        pq.remove();
        System.out.println(pq);

        System.out.println("----------------------");
        System.out.println(pq.peek());

    }
}
