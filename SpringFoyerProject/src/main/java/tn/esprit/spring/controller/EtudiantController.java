package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entite.Etudiant;
import tn.esprit.spring.serviceInterface.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Etudiant")
public class EtudiantController {
    IEtudiantService IEtudiantService;
    @GetMapping("/retrieveAllEtudiant")
    public List<Etudiant> retrieveAllEtudiant() {
        return IEtudiantService.retrieveAllEtudiant();
    }

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(Etudiant c) {
        return IEtudiantService.addEtudiant(c);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(Etudiant c) {
        return IEtudiantService.updateEtudiant(c);
    }

    @GetMapping("/retrieveEtudiant/{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable long idEtudiant) {
        return IEtudiantService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/removeEtudiant/{idEtudiant}")
    public void removeEtudiant(@PathVariable long idEtudiant) {
        IEtudiantService.removeEtudiant(idEtudiant);
    }



}
