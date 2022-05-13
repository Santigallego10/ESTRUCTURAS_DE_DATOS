package application.Entities;

import java.util.List;

public class BolsaSupermercado <T>{

    private List<T> products;

    public BolsaSupermercado(){
    }

    public List<T> getProducts() {
        return products;
    }

    public void addProduct(T t){
        this.products.add(t);
    }
}
