package application;

import application.Entities.*;

import java.util.ArrayList;
import java.util.List;

public abstract class MainApplication {
    public static void main(String[] args) {
        BolsaSupermercado<Cleaning> cleaningProducts = new BolsaSupermercado<>();
        BolsaSupermercado<Dairy> dairyProducts = new BolsaSupermercado<>();
        BolsaSupermercado<Fruit> fruitProducts = new BolsaSupermercado<>();
        BolsaSupermercado<Nonperishable> nonperishableProducts = new BolsaSupermercado<>();

        //CREATE PRODUCTS

        Cleaning cleaning = new Cleaning("Bleach",19990,"lavanda",2);
        Cleaning cleaning2 = new Cleaning("Soap",9900,"roses",0.5);
        Cleaning cleaning3 = new Cleaning("Cleaning Gel",6000,"cinammon",1);
        Cleaning cleaning4 = new Cleaning("Dish Soap",13000,"lavanda",3);
        Cleaning cleaning5 = new Cleaning("Soap",17900,"strawberry",1);

        List<Cleaning> cleaningList = new ArrayList<>();

        cleaningList.add(cleaning);
        cleaningList.add(cleaning2);
        cleaningList.add(cleaning3);
        cleaningList.add(cleaning4);
        cleaningList.add(cleaning5);

        cleaningProducts.setProducts(cleaningList);

        listProducts(cleaningProducts.getProducts());

        Dairy dairy = new Dairy("Milk",5000,20,10);
        Dairy dairy2 = new Dairy("Yogurt",3500,30,20);
        Dairy dairy3 = new Dairy("Cheese",3000,10,5);
        Dairy dairy4 = new Dairy("Chocolate Milk",4000,12,7);
        Dairy dairy5 = new Dairy("Almond Milk",9000,10,30);

        List<Dairy> dairyList = new ArrayList<>();

        dairyList.add(dairy);
        dairyList.add(dairy2);
        dairyList.add(dairy3);
        dairyList.add(dairy4);
        dairyList.add(dairy5);

        dairyProducts.setProducts(dairyList);

        listProducts(dairyProducts.getProducts());

        Fruit fruit = new Fruit("Apple",500,0.4,"Red");
        Fruit fruit2 = new Fruit("Banana",600,0.3,"Yellow");
        Fruit fruit3 = new Fruit("StrawBerry",1000,1,"Red");
        Fruit fruit4 = new Fruit("Pineapple",3000,2,"Yellow and Orange");
        Fruit fruit5 = new Fruit("BueBerry",2700,1.2,"Purple");

        List<Fruit> fruitList = new ArrayList<>();

        fruitList.add(fruit);
        fruitList.add(fruit2);
        fruitList.add(fruit3);
        fruitList.add(fruit4);
        fruitList.add(fruit5);

        fruitProducts.setProducts(fruitList);

        listProducts(fruitProducts.getProducts());

        Nonperishable nonperishable = new Nonperishable("Atun",3000,6,600);
        Nonperishable nonperishable2 = new Nonperishable("Fish",4000,3,1200);
        Nonperishable nonperishable3 = new Nonperishable("Corn",5000,20,490);
        Nonperishable nonperishable4 = new Nonperishable("Carrots",7000,10,300);
        Nonperishable nonperishable5 = new Nonperishable("Beans",6000,1,800);

        List<Nonperishable> nonperishableList = new ArrayList<>();

        nonperishableList.add(nonperishable);
        nonperishableList.add(nonperishable2);
        nonperishableList.add(nonperishable3);
        nonperishableList.add(nonperishable4);
        nonperishableList.add(nonperishable5);

        nonperishableProducts.setProducts(nonperishableList);


        listProducts(nonperishableProducts.getProducts());

    }

    private static <T> void listProducts(List<T> t) {
        String cadena = "Lista: ";
        for (T x:t) {
            cadena += x.toString();
        }
        System.out.println(cadena);
    }


}
