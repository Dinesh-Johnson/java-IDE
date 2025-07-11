package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Company {

    private String name;
    private String industry;
    private String location;
    private CEO ceo;
}
