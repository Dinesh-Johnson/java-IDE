package example.dto.product;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Product {

    private String name;
    private String type;
    private double price;
    private String modelNo;
    private int id;

}
