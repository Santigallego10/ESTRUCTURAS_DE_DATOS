package Auction;

public class Auction {
    private Product product;
    private String id;

    public Auction() {
    }

    public Auction(Product product, String id) {
        this.product = product;
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "product=" + product +
                ", id='" + id + '\'' +
                '}';
    }
}
