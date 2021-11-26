package com.grimels.lazurcityapi.controller;

import com.grimels.lazurcityapi.model.user.UserCredentials;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public interface UserController {

    @PostMapping(path = "/signin")
    void signin(@RequestBody UserCredentials signinRequest);

}
