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


}
