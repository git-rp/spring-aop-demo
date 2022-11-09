package com.demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkOut(String status){
        //Logging
        //Authentication and Authorization
        // Sanize data
        System.out.println("Checking out...."+status);
    }
    public int getQuantity(){
        return 2;
    }
}
