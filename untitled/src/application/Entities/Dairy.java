package application.Entities;

public class Dairy extends Product{

    private int amount;
    private int proteins;

    public Dairy(){
    }

    public Dairy(String name, double price, int amount, int proteins) {
        super(name, price);
        this.amount = amount;
        this.proteins = proteins;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }
}
