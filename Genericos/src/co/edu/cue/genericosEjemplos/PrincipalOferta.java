package co.edu.cue.genericosEjemplos;

public class PrincipalOferta {
    public static <T> void imprimirOfertas(Oferta<T>subasta){
        for(T a:subasta){
            System.out.println((a.toString()));
        }
    }


    public static void main(String[] args) {
        Oferta<ProductoEjemplo1> subasta = new Oferta<>(4);
        subasta.add(new ProductoEjemplo1(1234,"Celular",400));
        subasta.add(new ProductoEjemplo1(1212,"Gafas",100));
        subasta.add(new ProductoEjemplo1(1213,"Reloj",120));
        subasta.add(new ProductoEjemplo1(1232,"Lapicero",20));
        subasta.add(new ProductoDestacado<>(1232,"Pc",2000,"Agotado"));
        imprimirOfertas(subasta);
    }
}
