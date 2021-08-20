package com.grimels.lazurcityapi.model.history;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class RoomAccommodationsHistory {

    private LocalDate startRange;
    private LocalDate endRange;

    private RoomInfo room;
    private List<AccommodationInfo> accommodations;

}
