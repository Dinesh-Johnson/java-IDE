package com.xworkz.assoication.runner;

import com.xworkz.assoication.ecommerce.ECommercePlatform;
import com.xworkz.assoication.ecommerce.Product;
import com.xworkz.assoication.ecommerce.Review;
import com.xworkz.assoication.ecommerce.Seller;

public class EcommerceRunner {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform("Amazon");

        Seller seller1 = new Seller("Srinivasan Electronics");
        Product laptop = new Product("Laptop");
        laptop.addReview(new Review("Arun", "Good performance!"));
        laptop.addReview(new Review("Lakshmi", "Battery life is average"));

        Product phone = new Product("Smartphone");
        phone.addReview(new Review("Karthik", "Amazing camera"));

        seller1.addProduct(laptop);
        seller1.addProduct(phone);

        Seller seller2 = new Seller("Meenakshi Home Needs");
        Product chair = new Product("Wooden Chair");
        chair.addReview(new Review("Divya", "Very sturdy and comfortable"));

        seller2.addProduct(chair);

        platform.addSeller(seller1);
        platform.addSeller(seller2);

        platform.showAllReviews();
    }
}
