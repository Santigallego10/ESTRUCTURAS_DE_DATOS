package co.edu.cue.algortimosModuloSubasta;

import java.util.List;

public class Algorithm4 {

    public static void print(List<? extends Number> list) { // la pregunta es si el metodo compila.si.
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }

}
