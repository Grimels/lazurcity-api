package com.grimels.lazurcityapi.model;

import com.grimels.lazurcityapi.model.base.Auditable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class RoomDTO extends Auditable {

    private Integer id;

    @NotBlank(message = "Field 'name' could not be empty.")
    private String name;
    private String description;
    @NotBlank(message = "Field 'name' could not be empty.")
    private String type;
    @Min(value = 0, message = "Field 'maxAdultsQuantity' may not be less than 0.")
    private Integer maxAdultsQuantity;
    @Min(value = 0, message = "Field 'maxChildrenQuantity' may not be less than 0.")
    private Integer maxChildrenQuantity;

    private Boolean isBusy;

}
