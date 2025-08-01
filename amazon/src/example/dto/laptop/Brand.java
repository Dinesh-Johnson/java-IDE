package example.dto.laptop;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Brand {

    private String name;
    private String supportEmail;
    private String brandType;
    private String warrantyPeriod;
}
