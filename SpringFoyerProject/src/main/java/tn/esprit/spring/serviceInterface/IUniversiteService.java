package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entite.Chambre;
import tn.esprit.spring.entite.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversite();

    Universite addUniversite (Universite c);

    Universite updateUniversite (Universite c);

    Universite retrieveUniversite(long  idUniversite);

    void removeUniversite (long idUniversite);

     Universite  affecterFoyerAUniversite (long idFoyer, String nomUniversite) ;

     Universite desaffecterFoyerAUniversite(long idUniversite);
    List<Chambre> getChambresParNomUniversite(String nomUniversite);
}
