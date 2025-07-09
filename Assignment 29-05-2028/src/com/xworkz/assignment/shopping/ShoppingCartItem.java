package com.xworkz.assignment.shopping;

public class ShoppingCartItem {
    //8.Create a ShoppingCartItem class with name, quantity, and unit price. Add method to calculate total.

    int quantity;
    String name;
    double unitPrice;

    public ShoppingCartItem(String name,int quantity,double unitPrice){
        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
    }
    public double gettotalPrice(){
        return quantity*unitPrice;
    }
}
