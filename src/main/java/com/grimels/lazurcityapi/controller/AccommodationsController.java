package com.grimels.lazurcityapi.controller;

import com.grimels.lazurcityapi.model.AccommodationDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/accommodations")
public interface AccommodationsController {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    List<AccommodationDTO> getAccommodations();

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    AccommodationDTO saveAccommodation(@RequestBody @NotNull(message = "Request body may not be null.") AccommodationDTO accommodationCreationRequest);
}
