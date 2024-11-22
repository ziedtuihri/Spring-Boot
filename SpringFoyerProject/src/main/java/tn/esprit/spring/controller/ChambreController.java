package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entite.Chambre;
import tn.esprit.spring.entite.TypeChambre;
import tn.esprit.spring.serviceInterface.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Chambre")
public class ChambreController {

    IChambreService IChambreService;
    @GetMapping("/retrieveAllChambres")
    public List<Chambre> retrieveAllFoyers() {
        return IChambreService.retrieveAllFoyers();
    }

    @PostMapping("/addChambre")
    public Chambre addFoyer(Chambre c) {
        return IChambreService.addFoyer(c);
    }

    @PutMapping("/updateChambre")
    public Chambre updateFoyer(Chambre c) {
        return IChambreService.updateFoyer(c);
    }

    @GetMapping("/retrieveChambre/{idChambre}")
    public Chambre retrieveFoyer(@PathVariable long idChambre) {
        return IChambreService.retrieveFoyer(idChambre);
    }

    @DeleteMapping("/deleteChambre/{idChambre}")
    public void removeFoyer(@PathVariable long idChambre) {
        IChambreService.removeFoyer(idChambre);
    }


    @GetMapping("/bloc/{idBloc}/type/{typeC}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable long idBloc, @PathVariable TypeChambre typeC) {
         return IChambreService.getChambresParBlocEtType(idBloc, typeC);
    }

}
