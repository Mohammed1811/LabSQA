package org.example.Lab4.Task3;

public class Product {
    private String productId;
    private float price;

    public Product(String productId, float price) {
        this.productId = productId;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
