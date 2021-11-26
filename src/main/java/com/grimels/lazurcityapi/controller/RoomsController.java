package com.grimels.lazurcityapi.controller;

import com.grimels.lazurcityapi.model.Room;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/rooms")
public interface RoomsController {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Room> getRooms();

    @GetMapping(path = "/free", produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Room> getFreeRooms();

    @GetMapping(path = "/busy", produces = {MediaType.APPLICATION_JSON_VALUE})
    List<Room> getBusyRooms();

    @GetMapping(path = "/{roomId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    Room getRoom(@PathVariable("roomId") @NotNull int roomId);

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    Room saveRoom(@RequestBody @NotNull(message = "Request body may not be null.") Room roomCreationRequest);

    @GetMapping(path = "/types", produces = {MediaType.APPLICATION_JSON_VALUE})
    Set<String> getRoomTypes();

}
