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

    @GetMapping("/retrieveAllBlocs")
    public List<Bloc> retrieveAllBlocs() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/findBloc/{idBloc}")
    public Bloc retrieveBloc(@PathVariable long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc b) {
        return blocService.updateBloc(b);
    }


    @DeleteMapping("removeBloc/{idBloc}")
    public void removeBloc(@PathVariable long idBloc) {
        blocService.removeBloc(idBloc);
    }


}
