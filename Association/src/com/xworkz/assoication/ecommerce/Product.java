package com.xworkz.assoication.ecommerce;

public class Product {
    String name;
    Review[] reviews = new Review[5];
    int reviewCount = 0;

    public Product(String name) {
        this.name = name;
    }

    public void addReview(Review review) {
        reviews[reviewCount++] = review;
    }

    public void showReviews() {
        System.out.println("Product: " + name);
        for (int i = 0; i < reviewCount; i++) {
            System.out.println("  - " + reviews[i]);
        }
    }
}
