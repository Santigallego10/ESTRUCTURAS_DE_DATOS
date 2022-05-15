package application;

import application.Entities.*;

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

        cleaningProducts.addProduct(cleaning);
        cleaningProducts.addProduct(cleaning2);
        cleaningProducts.addProduct(cleaning3);
        cleaningProducts.addProduct(cleaning4);
        cleaningProducts.addProduct(cleaning5);

        Dairy dairy = new Dairy("Milk",5000,20,10);
        Dairy dairy2 = new Dairy("Yogurt",3500,30,20);
        Dairy dairy3 = new Dairy("Cheese",3000,10,5);
        Dairy dairy4 = new Dairy("Chocolate Milk",4000,12,7);
        Dairy dairy5 = new Dairy("Almond Milk",9000,10,30);

        dairyProducts.addProduct(dairy);
        dairyProducts.addProduct(dairy2);
        dairyProducts.addProduct(dairy3);
        dairyProducts.addProduct(dairy4);
        dairyProducts.addProduct(dairy5);

        Fruit fruit = new Fruit("Apple",500,0.4,"Red");
        Fruit fruit2 = new Fruit("Banana",600,0.3,"Yellow");
        Fruit fruit3 = new Fruit("StrawBerry",1000,1,"Red");
        Fruit fruit4 = new Fruit("Pineapple",3000,2,"Yellow and Orange");
        Fruit fruit5 = new Fruit("BueBerry",2700,1.2,"Purple");

        fruitProducts.addProduct(fruit);
        fruitProducts.addProduct(fruit2);
        fruitProducts.addProduct(fruit3);
        fruitProducts.addProduct(fruit4);
        fruitProducts.addProduct(fruit5);

        Nonperishable nonperishable = new Nonperishable("Atun",3000,6,600);
        Nonperishable nonperishable2 = new Nonperishable("Fish",4000,3,1200);
        Nonperishable nonperishable3 = new Nonperishable("Corn",5000,20,490);
        Nonperishable nonperishable4 = new Nonperishable("Carrots",7000,10,300);
        Nonperishable nonperishable5 = new Nonperishable("Beans",6000,1,800);

        nonperishableProducts.addProduct(nonperishable);
        nonperishableProducts.addProduct(nonperishable2);
        nonperishableProducts.addProduct(nonperishable3);
        nonperishableProducts.addProduct(nonperishable4);
        nonperishableProducts.addProduct(nonperishable5);




    }




}
