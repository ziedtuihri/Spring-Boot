package com.example.workshop.serviceInterface;

import com.example.workshop.entite.Foyer;

import java.util.List;

public interface IFoyerService {

    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long  idFoyer);

    void removeFoyer (long idFoyer);

}
