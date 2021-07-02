package com.grimels.lazurcityapi.model.base;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.sql.Date;

@AllArgsConstructor
@Data
@SuperBuilder
public class Auditable {

    private Date createdDate;
    private Date modifiedDate;

}
