package com.example.workshop.controller;


import com.example.workshop.entite.Etudiant;
import com.example.workshop.serviceInterface.IEtudiantService;
import com.example.workshop.serviceInterface.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // All methods in this class will return JSON responses by default
@AllArgsConstructor
@RequestMapping("/Etudiant") // all routes in this controller will start with /Etudiant
public class EtudiantController {

    IEtudiantService etudiantService;


}
