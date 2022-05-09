package Main.Ejemplo2;

import java.util.Arrays;
import java.util.List;

public class EjemploGenericos2 {
    public static void main(String[] args) {
        Product [] productsArray = {new Product(1015,"CellPhone",200),
                new Product(1013,"Tshirt",20)};
        Integer[] offerValues = {1, 5, 8};
        List<Product> productList = fromArrayToList(productsArray);
        List<Integer> integerList = fromArrayToList(offerValues);
        productList.forEach(System.out::println);

        List<String> usersNames = fromArrayToList(new String[]{"Pepe","Mafe"},
                offerValues);
    }

    private static <T>List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
    private static <T extends String, G>List<T> fromArrayToList(T[] c, G[] x) {
        for (G element:x) {
            System.out.println(element);
        }
        return Arrays.asList(c);
    }
}
