package com.xworkz.zepto.products;

public class Flipkart {

  public static void appName(){
      System.out.println("App Name :Flipkart");
  }
  public static void item(String itemName){
      System.out.println("Ice-Cream");
  }
  public static void brand(String itemName,String brandName,int price){
      System.out.println("Item is ="+ itemName);
      System.out.println("The Brand is ="+brandName);
      System.out.println("The price is ="+price);
  }
  public static void reviews(String brandName,String quality,String review){
      System.out.println("The Brand Name is ="+brandName);
      System.out.println("Quality -"+quality);
      System.out.println("Review --"+review);
  }
  public static void itemReviews(String itemName,String review,int price){
      System.out.println("Item is ="+ itemName);
      System.out.println("Review --"+review);
      System.out.println("The price is ="+price);
  }
  public static void checkOut(String itemName,String review,String brandName,double discount,int price){
      System.out.println("Item is ="+ itemName);
      System.out.println("Review --"+review);
      System.out.println("The Brand Name is ="+brandName);
      System.out.println("Discount is --"+discount);
      System.out.println("The price is ="+price);
  }
  public static void itemBrand(String[] items){
      for(int i=0; i<items.length;i++){
          System.out.println("The item is -"+items[i]);
      }
  }
  public static void brandName(String[] brandNames){
      for(int j=0; j<brandNames.length;j++){
          System.out.println("The item is -"+brandNames[j]);
      }
  }
  public static void checkingOut(String[] brandNames,String[] productNames){
      for(int k=0; k<brandNames.length;k++){
          System.out.println("The item is -"+brandNames[k]);
      }
      for(int l=0; l<productNames.length;l++){
          System.out.println("The item is -"+productNames[l]);
      }
  }




}
