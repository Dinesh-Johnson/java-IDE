package com.xworkz.encapsualtion.things;

public class Toys {
    public String name;
    public String type;
    public int qty;
    public int cost;
    public int ageRecommendation;


    @Override
    public String toString() {
        return "Toys{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", qty=" + qty +
                ", cost=" + cost +
                ", ageRecommendation=" + ageRecommendation +
                '}';
    }
}
