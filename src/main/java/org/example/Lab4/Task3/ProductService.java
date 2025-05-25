package org.example.Lab4.Task3;

public class ProductService {
    private ProductAPIClient apiClient;

    public ProductService(ProductAPIClient apiClient) {
        this.apiClient = apiClient;
    }

    public Product getProduct(String productId){
        return apiClient.getProduct(productId);
    }
}
