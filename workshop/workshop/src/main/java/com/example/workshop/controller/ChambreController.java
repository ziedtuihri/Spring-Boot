package com.example.workshop.controller;


import com.example.workshop.entite.Chambre;
import com.example.workshop.entite.Chambre;
import com.example.workshop.serviceInterface.IChambreService;
import com.example.workshop.serviceInterface.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // All methods in this class will return JSON responses by default
@AllArgsConstructor
@RequestMapping("/Chambre") // all routes in this controller will start with /Chambre
public class ChambreController {

    IChambreService chambreService;



}
