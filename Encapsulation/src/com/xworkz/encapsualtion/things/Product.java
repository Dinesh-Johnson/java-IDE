package com.xworkz.encapsualtion.things;

public class Product {
    private String productName;
    private double price;

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String getProductName() {
        return productName;
    }
    public String getProductDetails() {
        return "Product: " + productName + ", Price: " + price;
    }
}
