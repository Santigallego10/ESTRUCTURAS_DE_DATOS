package Main.Ejercicio4;

public class T <E>{

    private String name;
    private int amount;
    private double price;
    private Type type;

    public T(){

    }

    public T(String name, int amount, double price, Type type) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "T{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", type=" + type +
                '}';
    }
}
