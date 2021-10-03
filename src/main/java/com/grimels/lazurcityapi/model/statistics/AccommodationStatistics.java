package com.grimels.lazurcityapi.model.statistics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Map;

@Data
@AllArgsConstructor
@Builder
public class AccommodationStatistics {

    private LocalDate day;
    private Integer roomsLeavingToday;
    private Long dailyIncome;
    private Integer freeRooms;
    private Integer busyRooms;

    private Map<String, Long> seasonIncomeByRoomName;
    private Map<String, Long> seasonIncomeByRoomCategory;
    private Map<String, Long> incomesByKey;

}
