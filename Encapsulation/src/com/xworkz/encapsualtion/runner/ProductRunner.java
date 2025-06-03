package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Product;

public class ProductRunner {
    public static void main(String[] args) {

        Product product=new Product();
        product.setProductName("DSLR Camera");
        product.setPrice(50000.00);
        System.out.println(product.getProductDetails());
    }
}
