package com.grimels.lazurcityapi.model;

import com.grimels.lazurcityapi.model.base.Auditable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class Client extends Auditable {

    private Integer id;

    @NotBlank(message = "Field 'name' could not be empty.")
    private String name;
    private String comment;
    private String phoneNumber;

}
