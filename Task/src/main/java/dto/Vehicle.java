package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Vehicle {
    private String type;
    private String model;
    private String plateNumber;
    private Company company;
}
