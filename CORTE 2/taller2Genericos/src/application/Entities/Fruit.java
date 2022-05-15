package application.Entities;

public class Fruit extends Product{

    private double weight;
    private String color;

    public Fruit(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Fruit(String name, double price, double weight, String color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruta: {" +
                "peso=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
