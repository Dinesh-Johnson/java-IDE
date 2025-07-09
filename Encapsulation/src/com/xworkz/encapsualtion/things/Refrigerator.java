package com.xworkz.encapsualtion.things;

public class Refrigerator {

    public String brand;    //String brand,int qty,boolean deepCool,boolean insatllation,boolean display,boolean wifi,boolean voiceAssistant_access,String fridgeModel,String stars
    public int qty;//int height,String features,int cost,String otherBrand,int discount,boolean compliments,int doors,int compartments,int capacity,boolean stablizer,boolean homeDelivery
    public boolean deepCool;
    public boolean insatllation; //
    public boolean display;
    public boolean wifi;
    public boolean voiceAssistant_access;
    public String fridgeModel;
    public String stars;
    public int height;
    public String features;
    public int cost;
    public String otherBrand;
    public int discount;
    public boolean compliments;
    public int doors;
    public int compartments;
    public int capacity;
    public boolean stablizer;
    public boolean homeDelivery;

    public Refrigerator(String brand,int qty,boolean deepCool,boolean insatllation,boolean display,boolean wifi,boolean voiceAssistant_access,String fridgeModel,String stars,int height,String features,int cost,String otherBrand,int discount,boolean compliments,int doors,int compartments,int capacity,boolean stablizer,boolean homeDelivery){
        this.brand=brand;
        this.qty=qty;
        this.deepCool=deepCool;
        this.insatllation=insatllation;
        this.display=display;
        this.wifi=wifi;
        this.voiceAssistant_access=voiceAssistant_access;
        this.fridgeModel=fridgeModel;
        this.stars=stars;
        this.height=height;
        this.features=features;
        this.cost=cost;
        this.otherBrand=otherBrand;
        this.discount=discount;
        this.compartments=compartments;
        this.compliments=compliments;
        this.doors=doors;
        this.capacity=capacity;
        this.stablizer=stablizer;
        this.homeDelivery=homeDelivery;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "brand='" + brand + '\'' +
                ", qty=" + qty +
                ", deepCool=" + deepCool +
                ", insatllation=" + insatllation +
                ", display=" + display +
                ", wifi=" + wifi +
                ", voiceAssistant_access=" + voiceAssistant_access +
                ", fridgeModel='" + fridgeModel + '\'' +
                ", stars='" + stars + '\'' +
                ", height=" + height +
                ", features='" + features + '\'' +
                ", cost=" + cost +
                ", otherBrand='" + otherBrand + '\'' +
                ", discount=" + discount +
                ", compliments=" + compliments +
                ", doors=" + doors +
                ", compartments=" + compartments +
                ", capacity=" + capacity +
                ", stablizer=" + stablizer +
                ", homeDelivery=" + homeDelivery +
                '}';
    }
}

