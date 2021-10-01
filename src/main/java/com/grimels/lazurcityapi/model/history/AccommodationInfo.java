package com.grimels.lazurcityapi.model.history;

import com.grimels.lazurcityapi.model.Client;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class AccommodationInfo {

    private Integer id;

    private LocalDate startDate;
    private LocalDate endDate;
    private Integer daysLeft;

    private Client client;
    private String roomName;
    private Integer roomId;
    private Integer quantity;
    private Double price;

}
