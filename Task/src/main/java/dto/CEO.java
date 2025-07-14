package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class CEO {
    private String name;
    private int age;
    private double netWorth;
    private House house;

}
