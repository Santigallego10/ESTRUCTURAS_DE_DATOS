package Main.Ejemplo4;

import Main.Ejemplo2.Product;
import org.w3c.dom.ls.LSException;

import java.util.List;

import static Main.Ejemplo1.EjemplosGenericos.fromArrayToList;

public class EjemplosGenericos5 {
    public static void main(String[] args) {
        Product[] productsArray = {new Product(1015,"Box",50),
                new Product(1013,"Suit",10)};
        List<Product> productList = fromArrayToList(productsArray);
        System.out.println("General Products");
        printProducts(productList);

    }

    private static void printProducts(List<? extends Product> products) {
        products.forEach(System.out::println);
    }
}
