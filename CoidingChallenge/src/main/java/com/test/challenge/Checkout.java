package com.test.challenge;

import java.util.List;

/**
 * take in products and apply discounts, return final price
 */
public class Checkout {

    private PricingRules pricingRules;
    private List<Product> products;
    private String discountCode;
    private String total;

    public Checkout(){/**Default constructor*/}

    public Checkout(PricingRules pricingRules){

    }

    private Double total(){
         return this.pricingRules.applyDicsount();
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
//    Checkout co = new Checkout(pricingRules);
//co.addProduct(productCode);
//co.addProduct(productCode);
//co.addDiscountCode(“REGISTER30“)
//    price = co.total();
}
