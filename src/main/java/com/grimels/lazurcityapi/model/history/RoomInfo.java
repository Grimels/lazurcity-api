package com.grimels.lazurcityapi.model.history;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class RoomInfo {

    private Integer id;

    @NotBlank(message = "Field 'name' could not be empty.")
    private String name;
    private String description;
    @NotBlank(message = "Field 'type' could not be empty.")
    private String type;

}
