package com.xworkz.amazon.product;

public class AmazonRunner {

    public static void main(String[] args) {

        Amazon.displayUserName("Apple iPhone","Daneal Dinesh");
        System.out.println();

        String[] productList={"iPhone","Accessories","Headphones","Other"};
        int[] priceslist={150000,20000,30000,10000};
        Amazon.displayPrice(productList,priceslist,"Daneal Dinesh");
        System.out.println();

        int[] numbers={51,64,654,12};
        float[] decimal={1.4f, 5.4f, 9.2f};
        char[] chars={'C','D','N'};
        String[] apps={"Amazon","Flipkart","Meesho"};
        Amazon.acceptArray(numbers,decimal,chars,apps);
        System.out.println();
    }
}
