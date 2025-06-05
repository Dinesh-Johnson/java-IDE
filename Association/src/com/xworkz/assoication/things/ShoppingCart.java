package com.xworkz.assoication.things;

public class ShoppingCart {

        int itemCount;
        double totalAmount;

        public ShoppingCart(int itemCount, double totalAmount) {
            this.itemCount = itemCount;
            this.totalAmount = totalAmount;
        }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itemCount=" + itemCount +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
