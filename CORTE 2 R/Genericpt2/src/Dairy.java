public class Dairy extends Product {
    private int amount;
    private int protein;

    public Dairy(String name, Double price, int amount, int protein) {
        super(name, price);
        this.amount = amount;
        this.protein = protein;
    }

    public Dairy(int amount, int protein) {
        this.amount = amount;
        this.protein = protein;
    }

    public Dairy() {
    }

    public int getAmount() {
        return amount;
    }

    public int getProtein() {
        return protein;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }


}
