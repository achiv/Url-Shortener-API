package com.acprojects.urlshortener.repository;

import com.acprojects.urlshortener.model.UrlShortener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlShortenerRepository extends JpaRepository<UrlShortener, Long> {
    
}
