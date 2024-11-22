package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entite.Foyer;
import tn.esprit.spring.serviceInterface.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Foyer")
public class FoyerController {
    IFoyerService iFoyerService;


    @GetMapping("/retrieveAllFoyers")
    public List<Foyer> retrieveAllFoyers() {
        return iFoyerService.retrieveAllFoyers();
    }

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {

        return iFoyerService.addFoyer(f);
    }

    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return iFoyerService.updateFoyer(f);
    }

    @GetMapping("/findFoyer/{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable long idFoyer) {
        return iFoyerService.retrieveFoyer(idFoyer);
    }

    @DeleteMapping("/deletFoyer/{idFoyer}")
    public void removeFoyer(@PathVariable long idFoyer) {
        iFoyerService.removeFoyer(idFoyer);
    }

    @PostMapping("/ajouterAUniversite/{idUniversite}")
    public Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer, @PathVariable long idUniversite) {
        return iFoyerService.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
    }





}
