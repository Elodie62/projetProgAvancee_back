package com.example.sextoysback.ws;

import com.example.sextoysback.pojo.Catalogue;
import com.example.sextoysback.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = ApiRegistration.API_CATALOGUE)
public class CatalogueController {

    @Autowired
    public CatalogueService catalogueService;
    @GetMapping("/getCatalogue/{id}")
    public Catalogue getCatalogue(@PathVariable Long id){
        return catalogueService.getCatalogueById(id);
    }

    @GetMapping("/getAllCatalogue")
    public List<Catalogue> getAllCatalogue(){
        return catalogueService.getAllCatalogue();
    }

}
