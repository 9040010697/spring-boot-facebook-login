package com.ss.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String welcomeMessage() {
        return "Hello DJ";
    }
}
