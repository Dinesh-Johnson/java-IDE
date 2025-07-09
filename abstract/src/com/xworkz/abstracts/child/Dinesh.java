package com.xworkz.abstracts.child;

import com.xworkz.abstracts.abstrat.Product;

import java.time.LocalDateTime;

public class Dinesh extends Product {

    @Override
    public void buyProduct() {
        System.out.println("Dinesh is Purchasing a Product");
        System.out.println("Purchased at :"+LocalDateTime.now());
    }
}
