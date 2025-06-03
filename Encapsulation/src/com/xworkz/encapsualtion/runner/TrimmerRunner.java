package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Trimmer;

public class TrimmerRunner {
    public static void main(String[] args) {
        Trimmer trimmer=new Trimmer();
        trimmer.setBrand("Philips");
        trimmer.setCharger_type("Type-C");
        trimmer.setCost(3000);
        trimmer.setCompliments(false);
        trimmer.setWaterProof(true);
        trimmer.setQty(1);
        trimmer.setDiscount(15);
        trimmer.setOtherBrand("Xiaomi");
        trimmer.setChargerIncluded(true);
        trimmer.setBox_elements(2);
        System.out.println(trimmer);

    }
}
