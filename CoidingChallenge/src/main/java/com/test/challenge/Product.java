package com.test.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Entity class showing a product, Constructor by ProductCode
 */
public class Product {
    private final Map<ProductCode, Product> productValues = new HashMap<>();

    public ProductCode getProductCode() {
        return productCode;
    }

    public void setProductCode(ProductCode productCode) {
        this.productCode = productCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    private ProductCode productCode;
    private String productDescription;
    private Double productPrice;

    public Product(){};
    public Product(ProductCode productCode){
        this.productCode = productCode;
    }
    public  Product(String productCode){
        this.productCode = ProductCode.valueOf(productCode);
    }


}
enum ProductCode{
    R1, R2, R3
}
