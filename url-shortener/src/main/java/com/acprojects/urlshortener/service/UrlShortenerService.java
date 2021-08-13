package com.acprojects.urlshortener.service;

import com.acprojects.urlshortener.model.UrlShortener;

import org.springframework.web.servlet.view.RedirectView;

public interface UrlShortenerService {

    public UrlShortener saveUrlShortener(UrlShortener urlShortener);

	public RedirectView fetchUrlShortenerById(Long short_url);
    
}
