package com.example.workshop.controller;

import com.example.workshop.entite.Foyer;
import com.example.workshop.serviceInterface.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/findFoyer/{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable long idFoyer) {
        return iFoyerService.retrieveFoyer(idFoyer);
    }

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return iFoyerService.addFoyer(f);
    }

    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return iFoyerService.updateFoyer(f);
    }


    @DeleteMapping("removeFoyer/{idFoyer}")
    public void removeFoyer(@PathVariable long idFoyer) {
        iFoyerService.removeFoyer(idFoyer);
    }



}
