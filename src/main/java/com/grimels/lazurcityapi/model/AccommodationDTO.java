package com.grimels.lazurcityapi.model;

import com.grimels.lazurcityapi.model.base.Auditable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class AccommodationDTO extends Auditable {

    private Integer id;

    private ClientDTO client;
    private RoomDTO room;
    @NotNull(message = "Field 'price' may not be null.")
    private Double price;
    private Date startDate;
    @NotNull(message = "Field 'endDate' may not be null.")
    private Date endDate;
    @Min(value = 0, message = "Field 'adultsQuantity' may not be less than 0.")
    private Integer adultsQuantity;
    @Min(value = 0, message = "Field 'childrenQuantity' may not be less than 0.")
    private Integer childrenQuantity;

}
