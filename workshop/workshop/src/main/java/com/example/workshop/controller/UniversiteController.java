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



}
