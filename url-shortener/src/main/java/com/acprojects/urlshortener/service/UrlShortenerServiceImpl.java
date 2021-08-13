package com.acprojects.urlshortener.service;

import com.acprojects.urlshortener.model.UrlShortener;
import com.acprojects.urlshortener.repository.UrlShortenerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

@Service
public class UrlShortenerServiceImpl implements UrlShortenerService {

    @Autowired
    private UrlShortenerRepository urlShortenerRepository;

    @Override
    public UrlShortener saveUrlShortener(UrlShortener urlShortener) {
        return urlShortenerRepository.save(urlShortener);
    }

    @Override
    public RedirectView fetchUrlShortenerById(Long short_url) {
        RedirectView redirectView = new RedirectView();
        
        UrlShortener urlShortener =  urlShortenerRepository.findById(short_url).get();

        redirectView.setUrl(urlShortener.getOriginal_url());
        return redirectView;
    }

    
}
