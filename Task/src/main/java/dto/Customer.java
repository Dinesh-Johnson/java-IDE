package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter@ToString@AllArgsConstructor
public class Customer {

    private String name;
    private int age;
    private String gender;
    private Passport passport;

}
