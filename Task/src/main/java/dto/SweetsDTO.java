package dto;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class SweetsDTO {

    private String name;
    private double price;
    private String[] ingredients;
    private int quantity;
    private String pack;
}
