package com.xworkz.amazon.things;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class TelevisionDTO {

    private String brand;
    private int sizeInInches;
    private String type;
    private double cost;

}
