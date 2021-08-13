package com.acprojects.urlshortener.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "Welcome to AC Projects - URL Shortener API";
    }
    
}
