package com.example.workshop.serviceInterface;

import com.example.workshop.entite.Foyer;
import com.example.workshop.entite.Universite;
import com.example.workshop.repository.FoyerRepository;

import java.util.List;

public interface IUniversiteService {

    FoyerRepository foyerRepo = null;

    List<Universite> retrieveAllUniversites();

    Universite addUniversite (Universite c);

    Universite updateUniversite (Universite c);

    Universite retrieveUniversite(long  idUniversite);

    void removeUniversite (long idUniversite);

    public Universite affecterFoyerUniversite(long idFoyer, String nomUniversite);

    public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;

    public Universite desaffecterFoyerAUniversite (  long idUniversite) ;

    public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite) ;

}
