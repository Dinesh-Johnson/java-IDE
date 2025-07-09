package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.abstrat.Product;
import com.xworkz.abstracts.child.Dinesh;
import com.xworkz.abstracts.child.Kiran;

public class ProductRunner {
    public static void main(String[] args) {

        Product customer1=new Dinesh();
        Product customer2=new Kiran();

        customer1.buyProduct();
        System.out.println("-------------");
        customer2.buyProduct();
    }
}
