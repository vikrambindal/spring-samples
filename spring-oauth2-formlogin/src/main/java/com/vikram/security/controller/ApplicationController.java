package com.vikram.security.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping
public class ApplicationController {

    @GetMapping(value = "hello")
    public String sayHello(Principal principal) {
        String name = principal.getName();
        if (principal instanceof OAuth2AuthenticationToken) {
            name = ((OAuth2AuthenticationToken) principal).getPrincipal().getAttribute("name");
        }
        return "Hello " + name;
    }
}
