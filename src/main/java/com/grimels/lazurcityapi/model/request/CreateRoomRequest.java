package com.grimels.lazurcityapi.model.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@SuperBuilder
public class CreateRoomRequest {

    @NotBlank(message = "Field 'name' could not be empty.")
    private String name;
    private String description;
    @NotBlank(message = "Field 'name' could not be empty.")
    private String type;
    @Min(value = 0, message = "Field 'maxAdultsQuantity' may not be less than 0.")
    private Integer maxAdultsQuantity;
    @Min(value = 0, message = "Field 'maxChildrenQuantity' may not be less than 0.")
    private Integer maxChildrenQuantity;

}
