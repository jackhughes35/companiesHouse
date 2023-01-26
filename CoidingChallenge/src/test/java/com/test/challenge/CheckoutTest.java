package com.test.challenge;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckoutTest {
    // vars
    PricingRules pricingRules;
    Checkout checkout;

    List<String> productBasket;
    /**
     * Testing Scenario 1: R1 discount only
     */
    @Test
    private void testCheckout_Total_R1Applied(){
        productBasket = new ArrayList<>();
        productBasket.add("R1");
        productBasket.add("R1");
        productBasket.add("R1");
        productBasket.add("R1");
        productBasket.add("R2");
        productBasket.add("R3");
        pricingRules = new PricingRules();
        checkout = new Checkout(pricingRules);
    }

    /**
     * Testing scenario2: R2 discount only
     */
    @Test
    private void testCheckout_Total_R2Applied(){

    }

    /**
     * Testing scenario3: R3 discount only
     */
    @Test
    private void testCheckout_Total_R3Applied(){

    }

    /**
     * Testing scenario from testData supplied
     * Scenario1
     */
    @Test
    private void testCheckout_Total_Scenario1(){
        productBasket.add("R1");
        productBasket.add("R1");
        productBasket.add("R1");
        productBasket.add("R1");
        productBasket.add("R2");
        productBasket.add("R3");

        checkout.setDiscountCode("REGISTER30");

        Double price = checkout.total();
    }

    /**
     * Testing scenario from testData supplied
     * Scenario2
     */
    @Test
    private void testCheckout_Total_Scenario2(){

    }

    /**
     * Testing scenario from testData supplied
     * Scenario3
     */
    @Test
    private void testCheckout_Total_Scenario3(){

    }

    /**
     * Testing scenario from testData supplied
     * Scenario4
     */
    @Test
    private void testCheckout_Total_Scenario4(){

    }

    /**
     * Testing scenario from testData supplied
     * Scenario5
     */
    @Test
    private void testCheckout_Total_Scenario5(){

    }
}
