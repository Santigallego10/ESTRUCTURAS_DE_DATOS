package Ex4;

import Ex2.Product;

import java.util.List;

import static Ex1.EjemplosGenericos.fromArrayToList;

public class EjemplosGenericos4 {
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
