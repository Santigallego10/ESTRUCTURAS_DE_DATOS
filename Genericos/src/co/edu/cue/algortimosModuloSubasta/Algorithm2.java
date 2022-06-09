package co.edu.cue.algortimosModuloSubasta;

public class Algorithm2 {




    public static <T> void swap(T[] a, int i, int j) {
                                                        // metodo generico  que intercambia  las posiciones de dos diferentes elementos en una array.
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
