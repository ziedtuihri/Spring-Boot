package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entite.Reservation;
import tn.esprit.spring.serviceInterface.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {
    IReservationService IReservationService;
    @GetMapping("/retrieveAllReservation")
    public List<Reservation> retrieveAllReservation() {
        return IReservationService.retrieveAllReservation();
    }

    @PostMapping("/addReservation")
    public Reservation addReservation(Reservation c) {
        return IReservationService.addReservation(c);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(Reservation c) {
        return IReservationService.updateReservation(c);
    }

    @GetMapping("/retrieveReservation/{idReservation}")
    public Reservation retrieveReservation(@PathVariable String idReservation) {
        return IReservationService.retrieveReservation(idReservation);
    }

    @DeleteMapping("/removeReservation/{idReservation}")
    public void removeReservation(@PathVariable String idReservation) {
        IReservationService.removeReservation(idReservation);
    }

    @PostMapping("/ajouter")
    public Reservation ajouterReservation(@RequestParam long idChambre, @RequestParam long cinEtudiant) {
        return IReservationService.ajouterReservation(idChambre, cinEtudiant);
    }
}
