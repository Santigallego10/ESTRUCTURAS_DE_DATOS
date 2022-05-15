public class Fruit extends Product{

    private Double weight;
    private String color;

    public Fruit(String name, Double price, Double weight, String color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    public Fruit(Double weight, String color, String manzana_fuji, int i, int i1) {
        this.weight = weight;
        this.color = color;
    }

    public Fruit() {
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
