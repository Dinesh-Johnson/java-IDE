package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.Product;

import java.time.LocalDateTime;

public class Kiran extends Product {
    Product name;

    @Override
    public void buyProduct() {
        System.out.println("Kiran is Purchasing a Product");
        System.out.println("Purchased at :"+LocalDateTime.now());
    }
}
