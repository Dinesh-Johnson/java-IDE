package com.xworkz.amazon.things;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ShirtDTO {
    private String brand;
    private String size;
    private String color;
    private double price;
}
