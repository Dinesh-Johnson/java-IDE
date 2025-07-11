package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Detail {

    private String detailId;
    private String description;
    private String level;
    private Education education;
}
