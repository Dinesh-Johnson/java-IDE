package com.xworkz.assoication.things;

public class Order {
    String orderID;
    Item[] items=new Item[4];
    int itemcount=0;

    public Order(String orderID) {
        this.orderID = orderID;
    }
    public void addItems(Item item){
        items[itemcount]=item;
        itemcount++;
    }
    public void showDetails(){
        System.out.println("Order ID :"+orderID);
        System.out.println("Items in this order :");
        for (int i = 0; i < itemcount; i++) {
            System.out.println("- " + items[i]);
            
        }
    }
}
