package com.example.workshop.serviceInterface;

import com.example.workshop.entite.Bloc;

import java.util.List;

public interface IBlocService {

    List<Bloc> retrieveAllBloc();

    Bloc retrieveBloc (long  idBloc);

    Bloc addFoyer (Bloc b);

    Bloc updateFoyer (Bloc b);

    Bloc retrieveFoyer (long  idBloc);

    void removeFoyer (long idBloc);

    List<Bloc> getBlocByNameUniv(String name);

}
