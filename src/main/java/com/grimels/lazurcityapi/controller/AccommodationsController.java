package com.grimels.lazurcityapi.controller;

import com.grimels.lazurcityapi.model.Accommodation;
import com.grimels.lazurcityapi.model.request.CreateAccommodationRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/accommodations")
public interface AccommodationsController {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Accommodation> getAccommodations();

    @GetMapping(path = "/for/{date}", produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Accommodation> getAccommodationsExistedByDate(@PathVariable(name = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date);

    @GetMapping(path = "/from/{startDate}/to/{endDate}", produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Accommodation> getAccommodationsExistedInDateRange(@PathVariable(name = "startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
                                                            @PathVariable(name = "endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate);

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    Accommodation saveAccommodation(@RequestBody @NotNull(message = "Request body may not be null.") CreateAccommodationRequest accommodationCreationRequest);

}
