package Main.Ejemplo1;

public class Product {
    private int cod;
    private String name;
    private float sellValue;

    public Product(int cod, String name, float sellValue) {
        this.cod = cod;
        this.name = name;
        this.sellValue = sellValue;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSellValue() {
        return sellValue;
    }

    public void setSellValue(float sellValue) {
        this.sellValue = sellValue;
    }

    @Override
    public String toString() {
        return "Main{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                ", sellValue=" + sellValue +
                '}';
    }
}
