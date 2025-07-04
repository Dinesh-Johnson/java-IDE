package com.xworkz.amazon.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class DesktopDTO implements Comparable<DesktopDTO>{

//Design a class for storing product information such as id,name,type,manufauturedDate,
//manufacturer,costPerItem,discount,quantity,warranty
    private int id;
    private String name;
    private String type;
    private String manufacturedDate;
    private String manufacturer;
    private double costPerItem;
    private double discount;
    private int quantity;
    private int warrantyINYears;

    @Override
    public int compareTo(DesktopDTO o) {
        return Integer.compare(this.id,o.id);
    }
}
