package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Education {

    private String qualification;
    private String university;
    private int yearOfPassing;
    private double grade;
}
