package com.grimels.lazurcityapi.model.projection;

import com.grimels.lazurcityapi.model.Client;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class AccommodationProjection {

    private Integer id;

    private Client client;
    private Integer roomId;
    @NotNull(message = "Field 'price' may not be null.")
    private Double price;
    private Boolean isFinal;
    @Value(value = "#{new java.util.Date()}")
    private Date startDate;
    @NotNull(message = "Field 'endDate' may not be null.")
    private Date endDate;
    @Min(value = 0, message = "Field 'quantity' may not be less than 0.")
    private Integer quantity;

}
