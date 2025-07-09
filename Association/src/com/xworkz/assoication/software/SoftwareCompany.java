package com.xworkz.assoication.software;

public class SoftwareCompany {
    String name;
    Product[] products = new Product[5];
    int productCount = 0;

    public SoftwareCompany(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products[productCount++] = product;
    }

    public void showAllProductFeatures() {
        System.out.println("Software Company: " + name);
        for (int i = 0; i < productCount; i++) {
            products[i].showAllFeatures();
        }
    }
}
