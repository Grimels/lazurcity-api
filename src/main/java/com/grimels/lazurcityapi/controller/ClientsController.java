package com.grimels.lazurcityapi.controller;

import com.grimels.lazurcityapi.model.ClientDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/clients")
public interface ClientsController {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    List<ClientDTO> getClients();

    @GetMapping(path = "/{clientId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    ClientDTO getClient(@PathVariable("clientId") @NotNull int roomId);

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    ClientDTO saveClient(@RequestBody @NotNull(message = "Request body may not be null.") ClientDTO clientCreationRequest);

}
