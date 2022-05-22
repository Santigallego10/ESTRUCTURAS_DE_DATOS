public class Main {
    public static void main(String[] args) {
        BolsaSupermercado<Fruit> fruitBag = new BolsaSupermercado<>(5);
        BolsaSupermercado<Clean> cleanBag = new BolsaSupermercado<>(5);
        BolsaSupermercado<Dairy> DairyBag = new BolsaSupermercado<>(5);
        BolsaSupermercado<nonPerishable> NonPerishableBag = new BolsaSupermercado<>(5);
        fruitBag.addProduct(new Fruit("Orange",3.000, 3.00, "Orange"));
        fruitBag.addProduct(new Fruit("Watermelon", 10.000, 6.00, "Red & green"));
        fruitBag.addProduct(new Fruit("Grapes", 4.000, 2.00, "Purple"));
        fruitBag.addProduct(new Fruit("Peaches", 7.000, 4.00, "orange"));
        fruitBag.addProduct(new Fruit("Apple", 5.000, 50.0, "green"));

        cleanBag.addProduct(new Clean("Soap", 10.000, "smell of strawberries", 1.6));
        cleanBag.addProduct(new Clean("Shampoo", 12.000, "Smell of coco", 2.7));
        cleanBag.addProduct(new Clean("Antibacterial", 13.000, "Alcohol", 1.0));
        cleanBag.addProduct(new Clean("Clorox", 16.000, "hypochlorite", 4.0));
        cleanBag.addProduct(new Clean("Floor wax", 17.000, "Wax", 3.0));


        DairyBag.addProduct(new Dairy ("Cheese", 3.200, 100, 10));
        DairyBag.addProduct(new Dairy ("Milk", 4.500, 25, 8));
        DairyBag.addProduct(new Dairy ("Yogurt", 5.000, 15, 72));
        DairyBag.addProduct(new Dairy ("Butter", 3.900, 25, 11));
        DairyBag.addProduct(new Dairy("Kumis", 2.900, 70, 17));

        NonPerishableBag.addProduct(new nonPerishable("Tuna", 9.500, 100, 960));
        NonPerishableBag.addProduct(new nonPerishable("Sardine", 5.500, 50, 112));
        NonPerishableBag.addProduct(new nonPerishable("Vegetables", 6.000, 59, 103));
        NonPerishableBag.addProduct(new nonPerishable("Sausages", 3.400, 60, 132));
        NonPerishableBag.addProduct(new nonPerishable("Peas", 4.000, 50, 199));
        System.out.println("-------------------------------- Fruits ---------------------------------");
        for (Fruit fruit : fruitBag.getProducts()) {
            System.out.println("-------------------------------- " +  fruit.getName());
            System.out.println("Price: " + fruit.getPrice());
            System.out.println("Weight (Gr): " + fruit.getWeight());
            System.out.println("Color: " + fruit.getColor());
        }
        System.out.println("-------------------------------- Clean ---------------------------------");
        for (Clean prod : cleanBag.getProducts()) {
            System.out.println("-------------------------------- " +  prod.getName());
            System.out.println("Price: " + prod.getPrice());
            System.out.println("Components: " + prod.getComponents());
            System.out.println("Liters: " + prod.getLiters());
        }
        System.out.println("-------------------------------- Dairy---------------------------------");
        for (Dairy prod : DairyBag.getProducts()) {
            System.out.println("-------------------------------- " +  prod.getName());
            System.out.println("Price: " + prod.getPrice());
            System.out.println("amount (gr/cc): " + prod.getAmount());
            System.out.println("Proteins (gr): " + prod.getProtein());
        }
        System.out.println("-------------------------------- Non perishable---------------------------------");
        for (nonPerishable prod : NonPerishableBag.getProducts()) {
            System.out.println("-------------------------------- " +  prod.getName());
            System.out.println("Price: " + prod.getPrice());
            System.out.println("Calories (kCal): " + prod.getCalories());
            System.out.println("net content (gr): " + prod.getContent());
        }
    }
    }

