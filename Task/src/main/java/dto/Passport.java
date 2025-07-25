package dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@ToString@Getter
public class Passport {
    private String number;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private Country country;
}
