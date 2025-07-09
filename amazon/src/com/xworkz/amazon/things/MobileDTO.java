package com.xworkz.amazon.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class MobileDTO {

    private String brand;
    private String model;
    private int ramGB;
    private double price;
}
