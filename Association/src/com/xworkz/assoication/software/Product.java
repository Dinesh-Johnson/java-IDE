package com.xworkz.assoication.software;

public class Product {
    String name;
    Version[] versions = new Version[5];
    int versionCount = 0;

    public Product(String name) {
        this.name = name;
    }

    public void addVersion(Version version) {
        versions[versionCount++] = version;
    }

    public void showAllFeatures() {
        System.out.println("Product: " + name);
        for (int i = 0; i < versionCount; i++) {
            versions[i].showFeatures();
        }
    }
}
