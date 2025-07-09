package example.dto.laptop;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
public class Computer {
    private String os;
    private String ram;
    private String processor;
    private String storage;
}
