package com.grimels.lazurcityapi.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class CreateAccommodationRequest {

    private String clientName;
    private String clientPhoneNumber;
    @NotNull(message = "Room ID must be specified.")
    private Integer roomId;
    @NotNull(message = "Field 'price' may not be null.")
    private Integer price;
    private Boolean isFinal;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate;
    @NotNull(message = "Field 'endDate' may not be null.")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate endDate;
    @Min(value = 0, message = "Field 'quantity' may not be less than 0.")
    private Integer quantity;
    private String comment;

}
