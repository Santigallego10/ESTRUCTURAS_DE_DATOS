package co.edu.cue.ed.bolsaSupermercado.app;

import co.edu.cue.ed.bolsaSupermercado.model.BolsaSupermercado;
import co.edu.cue.ed.bolsaSupermercado.model.Cleaning;
import co.edu.cue.ed.bolsaSupermercado.model.Dairy;
import co.edu.cue.ed.bolsaSupermercado.model.Fruit;
import co.edu.cue.ed.bolsaSupermercado.model.NonPerishable;

public class Main {

	public static void main(String[] args) {

	
		BolsaSupermercado<Fruit> fruitBag = new BolsaSupermercado<>(5);
        BolsaSupermercado<Cleaning> cleaningBag = new BolsaSupermercado<>(5);
        BolsaSupermercado<Dairy> dairyBag = new BolsaSupermercado<>(5);
        BolsaSupermercado<NonPerishable> nonPerishableBag = new BolsaSupermercado<>(5);

        fruitBag.addProduct(new Fruit("apple fuji", 1200.00, 2500.0, "red"));
        fruitBag.addProduct(new Fruit("peach", 800.00, 1800.0,"orange"));
        fruitBag.addProduct(new Fruit("grapes",1000.00, 3500.0,"green"));
        fruitBag.addProduct(new Fruit("lemons",1200.00,  1500.0,"yellow"));
        fruitBag.addProduct(new Fruit("watermelon",1200.00, 4000.0, "red" ));
        
        cleaningBag.addProduct(new Cleaning("antibacterial", 1690.0, "Cif", 0.75));
        cleaningBag.addProduct(new Cleaning("dishwasher", 2290.0, "Quix", 1.2));
        cleaningBag.addProduct(new Cleaning("Cream Cleanser", 1390.0,"chlorine", 0.95));
        cleaningBag.addProduct(new Cleaning("Gel with lavender",  1380.0, "Lysoform", 0.45));
        cleaningBag.addProduct(new Cleaning("Lavender Disinfectant",1330.0, "Lysol",  0.9));
        
        dairyBag.addProduct(new Dairy ("Semi-skimmed Chocolate Flavored Milk",3000.0, 2, 1000));
        dairyBag.addProduct(new Dairy ("milk cream box",2000.0, 5, 500));
        dairyBag.addProduct(new Dairy ("Cheese", 8000.0, 4,959));
        dairyBag.addProduct(new Dairy ("Yoghurt Shake Strawberry Flavor Bag",1000.0, 6,  1190));
        dairyBag.addProduct(new Dairy ("Soprole Salted Butter",4000.0, 2, 1750));
        
        nonPerishableBag.addProduct(new NonPerishable("Tuna",10000.0, 500, 1000));
        nonPerishableBag.addProduct(new NonPerishable("Sardine",15000.0, 560,  1120));
        nonPerishableBag.addProduct(new NonPerishable("Canned beans",7000.0, 234,  1030));
        nonPerishableBag.addProduct(new NonPerishable("Chickpeas",6000.0, 700,  1320));
        nonPerishableBag.addProduct(new NonPerishable("Canned vegetables",8000.0, 500,  900));

        System.out.println("-------------------------------- Frutas ---------------------------------");
        for (Fruit fruit : fruitBag.getProducts()) {
            System.out.println("-------------------------------- " +  fruit.getName());
            System.out.println("Price: " + fruit.getPrice());
            System.out.println("Weight (gr): " + fruit.getWeight());
            System.out.println("Color: " + fruit.getColor());
        }

        System.out.println("-------------------------------- Limpieza ---------------------------------");
        for (Cleaning prod : cleaningBag.getProducts()) {
            System.out.println("-------------------------------- " +  prod.getName());
            System.out.println("Price: " + prod.getPrice());
            System.out.println("Components: " + prod.getComponents());
            System.out.println("Liters: " + prod.getLiters());
        }

        System.out.println("-------------------------------- Lacteo ---------------------------------");
        for (Dairy prod : dairyBag.getProducts()) {
            System.out.println("-------------------------------- " +  prod.getName());
            System.out.println("Price: " + prod.getPrice());
            System.out.println("Amount (gr/cc): " + prod.getAmount());
            System.out.println("Proteins (gr): " + prod.getProteins());
        }

        System.out.println("-------------------------------- NoPerecible ---------------------------------");
        for (NonPerishable prod : nonPerishableBag.getProducts()) {
            System.out.println("-------------------------------- " +  prod.getName());
            System.out.println("Price: " + prod.getPrice());
            System.out.println("Calories (kCal): " + prod.getCalories());
            System.out.println("Neto Content  (gr): " + prod.getContent());
        }

	
	}

}