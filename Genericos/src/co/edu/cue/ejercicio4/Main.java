package co.edu.cue.ejercicio4;


import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Elementos elemento1 = new Elementos<>("Harri Potter",11,54000, Type.LIBRO);
        Elementos elemento2 = new Elementos<>("Blade Runner",9,36000,Type.VIDEO);
        Elementos elemento3 = new Elementos<>("Motor",87,37000, Type.MAGAZINE);

        List<Elementos> elementos = new ArrayList<>();
        elementos.add(elemento1);
        elementos.add(elemento2);
        elementos.add(elemento3);

        for (Elementos t:elementos) {
            System.out.println(t.toString());
        }

    }

}
