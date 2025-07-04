package com.xworkz.amazon.things;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class OwnerDTO {
    private String name;
    private String email;
    private long phone;
}
