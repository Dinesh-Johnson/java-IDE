package com.xworkz.amazon.things;


import com.xworkz.amazon.constatnt.Type;
import com.xworkz.amazon.constatnt.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
@Setter
public class ApplicationDTO {
    private String name;
    private Version version;
    private LocalDate createdDate;
    private double size;
    private Type type;
    private boolean free;
    private double chargePerUser;
    private List<OwnerDTO> owners;
}
