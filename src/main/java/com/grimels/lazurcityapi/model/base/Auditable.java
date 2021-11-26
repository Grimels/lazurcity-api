package com.grimels.lazurcityapi.model.base;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@SuperBuilder
public class Auditable {

    private LocalDate createdDate;
    private LocalDate modifiedDate;

}
