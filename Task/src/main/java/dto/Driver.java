package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Driver {
    private String name;
    private String license;
    private int experience;
    private Vehicle vehicle;
}
