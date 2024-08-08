package com.example.gitactions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hi learning Git actions";
    }
}
