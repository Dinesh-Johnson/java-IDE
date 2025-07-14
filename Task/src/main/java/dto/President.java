package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString@Getter
public class President {
    private String name;
    private int termYears;
    private int age;
    private Driver driver;

}
