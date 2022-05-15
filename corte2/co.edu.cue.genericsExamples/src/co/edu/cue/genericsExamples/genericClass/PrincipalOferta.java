package co.edu.cue.genericsExamples.genericClass;

import co.edu.cue.genericsExamples.example1.Producto;

public class PrincipalOferta {
    public static <T> void imprimirOfertas(Oferta<T> subasta) {
        for (T a: subasta) {
            System.out.println(a.toString());
        }
    }

    public static void main(String[] args) {
        Oferta<Producto> subasta = new Oferta<>(4);
        subasta.add(new Producto(1234, "Celular", 400));
        subasta.add(new Producto(1212, "Gafas", 100));
        subasta.add(new Producto(1213, "Reloj", 120));
        subasta.add(new Producto(1232, "Lapicero", 20));

        imprimirOfertas(subasta);
    }
}
