package app.entities;

import java.util.HashSet;
import java.util.Set;

public class Product {

    private String productName;
    private String description;

    public Product(String productName, String description) {
        this.productName = productName;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
