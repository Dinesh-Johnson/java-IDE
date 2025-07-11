package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter@ToString@AllArgsConstructor
public class Country {

    private String name;
    private String code;
    private long population;
    private President president;
}
