package co.edu.cue.auctionsTest.model;

public class Product {
    private String name;
    private double initialPrice;

    public Product(String name, double initialPrice) {
        this.name = name;
        this.initialPrice = initialPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", initialPrice=" + initialPrice +
                '}';
    }
}
