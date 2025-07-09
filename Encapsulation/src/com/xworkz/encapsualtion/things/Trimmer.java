package com.xworkz.encapsualtion.things;

public class Trimmer {
    private String brand;
    private int qty;
    private boolean waterProof;
    private boolean chargerIncluded;
    private int box_elements;
    private String charger_type;
    private int cost;
    private String otherBrand;
    private int discount;
    private boolean compliments;

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

    @Override
    public String toString() {
        return "Trimmer{" +
                "Brand='" + brand + '\'' +
                ", qty=" + qty +
                ", waterProof=" + waterProof +
                ", chargerIncluded=" + chargerIncluded +
                ", box_elements=" + box_elements +
                ", charger_type='" + charger_type + '\'' +
                ", cost=" + cost +
                ", otherBrand='" + otherBrand + '\'' +
                ", discount=" + discount +
                ", compliments=" + compliments +
                '}';
    }
    
    
}
