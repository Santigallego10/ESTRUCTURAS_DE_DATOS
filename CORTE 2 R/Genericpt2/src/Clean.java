public class Clean extends Product {
    private String components;
    private Double liters;

    public Clean(String name, Double price, String components, Double liters) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }

    public Clean(String components, Double liters) {
        this.components = components;
        this.liters = liters;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public Double getLiters() {
        return liters;
    }

    public void setLiters(Double liters) {
        this.liters = liters;
    }
}
