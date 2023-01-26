package com.test.challenge;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Apply discounts
 */
public class PricingRules {
    // create initial variables
    private Double finalPrice;
    private Double register30Price;
    private Integer numberOfBogofs = 0;
    // Constructor
    public PricingRules(){/**default*/
    }

    public Double applyDicsount(List<String> productCodes, Optional<String> discountCode){
        // Map products from Codes supplied
        List<Product> products = productCodes.stream().map(product -> new Product(product)).collect(Collectors.toList());
//        if(){
//
//        }

        if(discountCode.isPresent()){
            // case for REGISTER30
            if(discountCode.get().equalsIgnoreCase("REGISTER30")){
                // take basked and apply 30% discount

                // if register30 price is less final calculated price, set calculted price to register30 price.
            }
        }

        return finalPrice;
    }
    // Requirement 1
    private Double discountR1(){
        finalPrice = null;

        return finalPrice;
    }

    // Requirement 2
    private Double discountR2(List<Product> products){

        products.stream()
                .forEach(product -> {
                    if(product.getProductCode().equals(ProductCode.R3)){
                        // apply BOGOF
                        numberOfBogofs+=1;
                        if(numberOfBogofs%2 == 0){

                        }else{
                            finalPrice+=product.getProductPrice();
                        }
                    }  else {
                        finalPrice+=product.getProductPrice();
                    }
        });
        // Check number of BOGOF's and apply discount to them and add to FinalPrice

        return finalPrice;
    }

    // method for Requirement 3, applying 30% discount to whole price
    private Double discountSpecialCode(Double finalPrice){
        return finalPrice*0.3;
    }
}
