package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class House {
    private String address;
    private int floors;
    private boolean owned;
    private Security security;
}
