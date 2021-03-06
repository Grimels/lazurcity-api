package com.grimels.lazurcityapi.controller;

import com.grimels.lazurcityapi.model.Accommodation;
import com.grimels.lazurcityapi.model.history.RoomAccommodationsHistory;
import com.grimels.lazurcityapi.model.request.CreateAccommodationRequest;
import com.grimels.lazurcityapi.model.request.UpdateAccommodationRequest;
import com.grimels.lazurcityapi.model.statistics.AccommodationStatistics;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/accommodations")
public interface AccommodationsController {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Accommodation> getAccommodations();

    @GetMapping(path = "/history/from/{startDate}/to/{endDate}", produces = {MediaType.APPLICATION_JSON_VALUE})
    List<RoomAccommodationsHistory> getRoomsAccommodationsHistoryInRange(@PathVariable(name = "startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                                                         @PathVariable(name = "endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate);

    @GetMapping(path = "/for/{date}", produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Accommodation> getAccommodationsExistedByDate(@PathVariable(name = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date);

    @GetMapping(path = "/from/{startDate}/to/{endDate}", produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Accommodation> getAccommodationsExistedInDateRange(@PathVariable(name = "startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                                            @PathVariable(name = "endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate);

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    Accommodation saveAccommodation(@RequestBody @NotNull(message = "Request body may not be null.") CreateAccommodationRequest accommodationCreationRequest);

    @PutMapping(path = "/{accommodationId}", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    void updateAccommodation(@PathVariable(name = "accommodationId") Integer accommodationId,
                                      @RequestBody @NotNull(message = "Request body may not be null.") UpdateAccommodationRequest updateAccommodationRequest);

    @DeleteMapping(path = "/{accommodationId}")
    void deleteAccommodation(@PathVariable(name = "accommodationId") Integer accommodationId);

    @GetMapping(path = "/statistics/from/{startDate}/to/{endDate}", produces = {MediaType.APPLICATION_JSON_VALUE})
    AccommodationStatistics getStatistics(@PathVariable(name = "startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                          @PathVariable(name = "endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate,
                                          @RequestParam(name = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date);

}
