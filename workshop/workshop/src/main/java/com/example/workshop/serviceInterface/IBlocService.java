package com.example.workshop.serviceInterface;

import com.example.workshop.entite.Bloc;

import java.util.List;

public interface IBlocService {

    List<Bloc> retrieveAllBlocs();

    Bloc retrieveBloc (long  idBloc);

    Bloc addBloc (Bloc b);

    Bloc updateBloc (Bloc b);

    void removeBloc (long idBloc);

    List<Bloc> getBlocByNameUniv(String name);

}
