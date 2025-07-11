package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Security {
    private String id;
    private String type;
    private int level;
    private Job job;


}
