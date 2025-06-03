package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Toys;

public class ToysRunner {
    public static void main(String[] args) {

        Toys toys=new Toys();
        toys.name="Remote Car";
        toys.qty=1;
        toys.cost=500;
        toys.type="plastic";
        toys.ageRecommendation=10;
        System.out.println(toys);
    }
}
