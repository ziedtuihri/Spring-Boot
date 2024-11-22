package com.example.workshop.controller;


import com.example.workshop.entite.Bloc;
import com.example.workshop.serviceInterface.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // All methods in this class will return JSON responses by default
@AllArgsConstructor
@RequestMapping("/Bloc") // all routes in this controller will start with /Bloc
public class BlocController {

    IBlocService blocService;


}
