package com.xworkz.amazon.sarees;

public class Appliances {

    String name;
    int qty;
    double cost;
    String brand;
    String type;
    int warrantyYears;

    public Appliances(String name, int qty, double cost, String brand, String type, int warrantyYears) {
        this.name = name;
        this.qty = qty;
        this.cost = cost;
        this.brand = brand;
        this.type = type;
        this.warrantyYears = warrantyYears;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getCost() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "name='" + name + '\'' +
                ", qty=" + qty +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", warrantyYears=" + warrantyYears +
                '}';
    }
}
