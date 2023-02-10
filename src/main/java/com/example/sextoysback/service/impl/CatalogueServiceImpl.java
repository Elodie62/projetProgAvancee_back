package com.example.sextoysback.service.impl;

import com.example.sextoysback.pojo.Catalogue;
import com.example.sextoysback.repository.CatalogueRepository;
import com.example.sextoysback.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogueServiceImpl implements CatalogueService {

    @Autowired
    public CatalogueRepository catalogueRepository;

    @Override
    public List<Catalogue> getAllCatalogue() {
        return catalogueRepository.findAll();
    }

    @Override
    public Catalogue getCatalogueById(Long id) {
        return catalogueRepository.findById(id).get();
    }
}

