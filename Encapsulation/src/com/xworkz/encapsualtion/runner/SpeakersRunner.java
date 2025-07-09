package com.xworkz.encapsualtion.runner;

import com.xworkz.encapsualtion.things.Speakers;

public class SpeakersRunner {
    public static void main(String[] args) {

        Speakers speakers= new Speakers("JBL",1,true,true,true,true,true,"x450",true,2,"Sony",10,false,"Type-c",5000);
        speakers.brand="JBL";
        speakers.qty=1;
        speakers.waterProof=true;
        speakers.speakerName="X-440";
        speakers.box_elements=2;
        speakers.otherBrand="Sony";
        speakers.cost=5000;
        speakers.charger_type="Type-C";
        System.out.println("BRAND :"+speakers.getBrand());
        System.out.println("qty :"+speakers.getQty());
        System.out.println("Waterproof :"+speakers.isWaterProof());
        System.out.println("Speaker Model Name :"+speakers.getSpeakerName());
        System.out.println("Discount :"+speakers.getDiscount()+" %");
        System.out.println("Box Elements :"+speakers.getBox_elements());
        System.out.println("Charger Type :"+speakers.getCharger_type());
        System.out.println("Total Cost :"+"$"+speakers.getCost());
    }
}
