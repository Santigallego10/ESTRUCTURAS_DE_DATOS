package Main.AlgoritmoSubastas;

import java.util.List;

public class Auction {

    private int id;
    private Product product;

    public Auction(){

    }

    public Auction(int id, Product product) {
        this.id = id;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "id=" + id +
                ", product=" + product +
                '}';
    }
}
