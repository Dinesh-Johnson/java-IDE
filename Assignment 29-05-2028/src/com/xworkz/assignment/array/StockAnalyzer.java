package com.xworkz.assignment.array;

public class StockAnalyzer {
    //15.Create a class StockAnalyzer that finds the day of highest stock value from an array of prices.

    public static void main(String[] args) {

        double[] prices={117.43, 119.87, 123.19, 121.11, 128.04, 126.66};

        double max=0;
        int day=0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >max) {
                max =prices[i];
                day=i;
            }
        }
        System.out.println("Highest price on day " + (day + 1) + ": " + max);
    }
}
