package com.acprojects.urlshortener.controller;

import com.acprojects.urlshortener.model.UrlShortener;
import com.acprojects.urlshortener.service.UrlShortenerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UrlShortenerController {

    @Autowired
    private UrlShortenerService urlShortenerService;

    @PostMapping("/api/shorturl")
    public UrlShortener saveUrlShortener(@RequestBody UrlShortener urlShortener){
        return urlShortenerService.saveUrlShortener(urlShortener);
    }

    @GetMapping("/api/shorturl/{short_url}")
    public RedirectView fetchUrlShortenerById(@PathVariable("short_url") Long short_url){
        return urlShortenerService.fetchUrlShortenerById(short_url);
    }
    
}
