package application.Entities;

public class Cleaning extends Product{

    private String components;
    private double liters;

    public Cleaning() {
    }

    public Cleaning(String name,double price,String components, double liters) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Producto de limpieza: {" +
                "componentes ='" + components + '\'' +
                ", litros =" + liters +
                '}';
    }
}
