import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado <T> {

    private List<T>products;
    private int amountElements;

    public BolsaSupermercado( int amountElements) {
        this.products = new ArrayList<>();
        this.amountElements = amountElements;
    }

    public BolsaSupermercado() {

    }

    public List<T> getProducts() {
        return products;
    }

    public void addProduct (T t){
        if(this.products.size()<=amountElements){
            this.products.add(t);
        }else{
            throw new RuntimeException("you cannot add this product.");
        }
    }
}
