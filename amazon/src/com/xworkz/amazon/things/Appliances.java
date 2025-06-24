package com.xworkz.amazon.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Appliances {

    String name;
    int qty;
    double cost;
    String brand;
    String type;
    int warrantyYears;

}
