package example.dto.person;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Address {
    private String no;
    private String street;
    private String city;
    private int pincode;
}
