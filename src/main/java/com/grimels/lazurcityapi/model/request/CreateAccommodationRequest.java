package com.grimels.lazurcityapi.model.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@SuperBuilder
public class CreateAccommodationRequest {

    private Integer clientId;
    @NotNull(message = "Room ID must be specified.")
    private Integer roomId;
    @NotNull(message = "Field 'price' may not be null.")
    private Double price;
    private Boolean isFinal;
    private Date startDate;
    @NotNull(message = "Field 'endDate' may not be null.")
    private Date endDate;
    @Min(value = 0, message = "Field 'quantity' may not be less than 0.")
    private Integer quantity;

}
