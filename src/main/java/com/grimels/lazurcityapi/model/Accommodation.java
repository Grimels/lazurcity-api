package com.grimels.lazurcityapi.model;

import com.grimels.lazurcityapi.model.base.Auditable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class Accommodation extends Auditable {

    private Integer id;

    private Client client;
    private Room room;
    @NotNull(message = "Field 'price' may not be null.")
    private Double price;
    private Boolean isFinal;
    @Value(value = "#{new java.util.Date()}")
    private LocalDate startDate;
    @NotNull(message = "Field 'endDate' may not be null.")
    private LocalDate endDate;
    @Min(value = 0, message = "Field 'quantity' may not be less than 0.")
    private Integer quantity;

}
