package example2.anuncio;

import java.util.LinkedList;
import java.util.Queue;

public class MainAdvertisement {

    public static void main(String[] args) {
        Queue<Advertisement> pq= new LinkedList<>();

        pq.add(new Advertisement("Gafas", "del sol",30));
        pq.add(new Advertisement("Lampara", "de mesa",32));
        pq.add(new Advertisement("Botas", "vaquero",120));
        pq.add(new Advertisement("Botas", "vaquero",120));

        System.out.println(pq);

        System.out.println("-----------------");
        pq.remove();
        System.out.println(pq);

        System.out.println("-----------------");
        System.out.println(pq.peek());

    }


}
