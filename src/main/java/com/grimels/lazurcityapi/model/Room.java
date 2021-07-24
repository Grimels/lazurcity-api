package com.grimels.lazurcityapi.model;

import com.grimels.lazurcityapi.model.base.Auditable;
import com.grimels.lazurcityapi.model.projection.AccommodationProjection;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class Room extends Auditable {

    private Integer id;

    @NotBlank(message = "Field 'name' could not be empty.")
    private String name;
    private String description;
    @NotBlank(message = "Field 'type' could not be empty.")
    private String type;

    private Boolean isBusy;

    private AccommodationProjection latestAccommodation;

}
