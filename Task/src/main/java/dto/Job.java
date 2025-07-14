package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Job {
    private String role;
    private double salary;
    private String location;
    private Detail detail;
}
