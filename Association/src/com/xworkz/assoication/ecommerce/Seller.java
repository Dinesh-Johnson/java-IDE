package com.xworkz.assoication.ecommerce;

public class Seller {
    String name;
    Product[] products = new Product[5];
    int productCount = 0;

    public Seller(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products[productCount++] = product;
    }

    void showProductReviews() {
        System.out.println("Seller: " + name);
        for (int i = 0; i < productCount; i++) {
            products[i].showReviews();
        }
    }
}
