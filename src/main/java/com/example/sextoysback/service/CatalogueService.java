package com.example.sextoysback.service;

import com.example.sextoysback.pojo.Catalogue;

import java.util.List;

public interface CatalogueService {

    List<Catalogue> getAllCatalogue();
    Catalogue getCatalogueById(Long id);
}
