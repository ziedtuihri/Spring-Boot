package com.example.workshop.controller;


import com.example.workshop.entite.Reservation;
import com.example.workshop.serviceInterface.IReservationService;
import com.example.workshop.serviceInterface.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // All methods in this class will return JSON responses by default
@AllArgsConstructor
@RequestMapping("/Reservation") // all routes in this controller will start with /Reservation
public class ReservationController {

    IReservationService reservationService;

    @GetMapping("/retrieveAllReservations")
    public List<Reservation> retrieveAllReservations() {
        return reservationService.retrieveAllReservation();
    }

    @GetMapping("/findReservation/{idReservation}")
    public Reservation retrieveReservation(@PathVariable long idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation f) {
        return reservationService.addReservation(f);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation f) {
        return reservationService.updateReservation(f);
    }

    @DeleteMapping("removeReservation/{idReservation}")
    public void removeReservation(@PathVariable long idReservation) {
        reservationService.removeReservation(idReservation);
    }


}
