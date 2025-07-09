package com.xworkz.encapsualtion.things;

public class Speakers {
    public String brand;
    public int qty;
    public boolean waterProof;
    public boolean chargerIncluded; //
    public boolean streos;
    public boolean blutooth_5;
    public boolean voiceAssistant_access;
    public String speakerName;
    public boolean wireless;
    public int box_elements; //int box_elements,String charger_type,int cost,String charger_type,int cost,String otherBrand,int discount,boolean compliments
    public String charger_type;
    public int cost;
    public String otherBrand;
    public int discount;
    public boolean compliments;

    public Speakers(String brand,int qty,boolean waterProof,boolean chargerIncluded,boolean streos,boolean blutooth_5,boolean voiceAssistant_access,String speakerName,boolean wireless,int box_elements,String otherBrand,int discount,boolean compliments,String charger_type,int cost){

        this.brand=brand;
        this.qty=qty;
        this.waterProof=waterProof;
        this.chargerIncluded=chargerIncluded;
        this.streos=streos;
        this.blutooth_5=blutooth_5;
        this.voiceAssistant_access=voiceAssistant_access;
        this.speakerName=speakerName;
        this.wireless=wireless;
        this.box_elements=box_elements;
        this.charger_type=charger_type;
        this.cost=cost;
        this.otherBrand=otherBrand;
        this.discount=discount;
        this.compliments=compliments;

    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public void setWaterProof(boolean waterProof){
        this.waterProof=waterProof;
    }
    public void setChargerIncluded(boolean chargerIncluded){
        this.chargerIncluded=chargerIncluded;
    }
    public void setBox_elements(int box_elements){
        this.box_elements=box_elements;
    }
    public void setCharger_type(String charger_type){
        this.charger_type=charger_type;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
    public void setOtherBrand(String otherBrand){
        this.otherBrand=otherBrand;
    }
    public void setDiscount(int discount){
        this.discount=discount;
    }
    public void setStreos(boolean streos){

    }
    public void setBlutooth_5(boolean blutooth_5){
        this.blutooth_5=blutooth_5;
    }
    public void setSpeakerName(String speakerName){
        this.speakerName=speakerName;
    }
    public void setWireless(boolean wireless){
        this.wireless=wireless;
    }
    public void setVoiceAssistant_access(boolean voiceAssistant_access){
        this.voiceAssistant_access=voiceAssistant_access;
    }
    public void setCompliments(boolean compliments){
        this.compliments=compliments;
    }
    public String getBrand(){
        return brand;
    }
    public String getCharger_type(){
        return charger_type;
    }
    public String getOtherBrand(){
        return otherBrand;
    }
    public String getSpeakerName(){
        return speakerName;
    }
    public int getQty(){
        return qty;
    }
    public int getCost(){
        return qty;
    }
    public int getBox_elements(){
        return box_elements;
    }
    public int getDiscount(){
        return discount;
    }
    public boolean isWaterProof(){
        return waterProof;
    }
  
    

    @Override
    public String toString() {
        return "Speakers{" +
                "brand='" + brand + '\'' +
                ", qty=" + qty +
                ", waterProof=" + waterProof +
                ", chargerIncluded=" + chargerIncluded +
                ", streos=" + streos +
                ", blutooth_5=" + blutooth_5 +
                ", voiceAssistant_access=" + voiceAssistant_access +
                ", speakerName='" + speakerName + '\'' +
                ", wireless=" + wireless +
                ", box_elements=" + box_elements +
                ", charger_type='" + charger_type + '\'' +
                ", cost=" + cost +
                ", otherBrand='" + otherBrand + '\'' +
                ", discount=" + discount +
                ", compliments=" + compliments +
                '}';
    }
}
