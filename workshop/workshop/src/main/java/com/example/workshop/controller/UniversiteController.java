package com.example.workshop.controller;


import com.example.workshop.entite.Universite;
import com.example.workshop.serviceInterface.IUniversiteService;
import com.example.workshop.serviceInterface.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // All methods in this class will return JSON responses by default
@AllArgsConstructor
@RequestMapping("/Universite") // all routes in this controller will start with /Universite
public class UniversiteController {

    IUniversiteService universiteService;

    @GetMapping("/retrieveAllUniversites")
    public List<Universite> retrieveAllUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/findUniversite/{idUniversite}")
    public Universite retrieveUniversite(@PathVariable long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite f) {
        return universiteService.addUniversite(f);
    }

    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite f) {
        return universiteService.updateUniversite(f);
    }


    @DeleteMapping("removeUniversite/{idUniversite}")
    public void removeUniversite(@PathVariable long idUniversite) {
        universiteService.removeUniversite(idUniversite);
    }



}
