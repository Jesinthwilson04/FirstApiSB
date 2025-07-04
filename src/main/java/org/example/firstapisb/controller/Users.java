package org.example.firstapisb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Users {
    @GetMapping("/login")
    public String Login(){
        return "User logged in";
    }
}
