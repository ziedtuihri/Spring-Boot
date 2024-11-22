package com.example.workshop.controller;


import com.example.workshop.entite.Reservation;
import com.example.workshop.serviceInterface.IReservationService;
import com.example.workshop.serviceInterface.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController  // All methods in this class will return JSON responses by default
@AllArgsConstructor
@RequestMapping("/Reservation") // all routes in this controller will start with /Reservation
public class ReservationController {

    IReservationService reservationService;




}
