package com.example.workshop.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // All methods in this class will return JSON responses by default
@AllArgsConstructor
@RequestMapping("/Bloc")
public class BlocController {
}
