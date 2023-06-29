package com.vikram.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping
public class ApplicationController {

    @GetMapping(value = "hello")
    public String sayHello(Principal principal) {
        return "Hello " + principal.getName();
    }
}
