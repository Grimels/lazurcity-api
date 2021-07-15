package com.grimels.lazurcityapi.controller;

import com.grimels.lazurcityapi.model.Accommodation;
import com.grimels.lazurcityapi.model.request.CreateAccommodationRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/accommodations")
public interface AccommodationsController {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Accommodation> getAccommodations(@RequestParam(name = "startDate") Date startDate,
                                          @RequestParam(name = "endDate") Date endDate);

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    Accommodation saveAccommodation(@RequestBody @NotNull(message = "Request body may not be null.") CreateAccommodationRequest accommodationCreationRequest);

}
