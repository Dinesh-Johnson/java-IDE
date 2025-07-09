package com.xworkz.amazon.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class LaptopDTO implements Comparable<LaptopDTO>{

    private String brand;
    private String processor;
    private int storageGB;
    private double price;

    @Override
    public int compareTo(LaptopDTO o) {
        LaptopDTO left = this;
        LaptopDTO right = o;
        if (left.price==right.price){
            return 0;
        } else if (left.price > right.price) {
            return 545199;
        }
        return -9954;
    }
}
