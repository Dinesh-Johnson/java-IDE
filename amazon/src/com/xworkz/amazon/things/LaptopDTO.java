package com.xworkz.amazon.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class LaptopDTO {

    private String brand;
    private String processor;
    private int storageGB;
    private double price;
}
