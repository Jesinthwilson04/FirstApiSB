package org.example.firstapisb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String display(){
        return "Helloworld";
    }
    @GetMapping("/about")
    public String age(){
        return "I am Jesinthwilson Aroneraj and i am the ownwer of this page.";
    }

}
