package co.edu.cue.algortimosModuloSubasta;

import java.util.List;

public class Algorithm5 { // Escriba un metodo generico que encuentre el maximo elemento en una lista.

    public static <T extends Object & Comparable<? super T>>
    T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }

}
