package com.xworkz.assoication.ecommerce;

public class ECommercePlatform {
    String name;
    Seller[] sellers = new Seller[5];
    int sellerCount = 0;

    public ECommercePlatform(String name) {
        this.name = name;
    }

    public void addSeller(Seller seller) {
        sellers[sellerCount++] = seller;
    }

    public void showAllReviews() {
        System.out.println("E-Commerce Platform: " + name);
        for (int i = 0; i < sellerCount; i++) {
            sellers[i].showProductReviews();
        }
    }
}
