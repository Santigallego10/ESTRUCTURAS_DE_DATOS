package Main.Ejemplo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemplosGenericos {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1210, "HeadPhones",30));
        Product offeredProduct = products.iterator().next();
        System.out.println(offeredProduct);

        Product[] arrayProducts = {new Product(1015, "Box",50),
                new Product(1013,"Suit",10)};

        Integer [] intArray = {1, 5, 8};
        List<Product> productList = fromArrayToList(arrayProducts);
        List<Integer> integerList = fromArrayToList(intArray);
        List<Integer> integerList2 = fromArrayToListOnlyNumbers(intArray);
        productList.forEach(System.out::println);

    }

    private static <T extends Number>List<T> fromArrayToListOnlyNumbers(T[] c) {
        return Arrays.asList(c);
    }

    public static <T>List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
}
