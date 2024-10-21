package com.example.workshop.serviceInterface;

import com.example.workshop.entite.Bloc;
import com.example.workshop.entite.Chambre;
import com.example.workshop.entite.TypeChambre;

import java.util.List;

public interface IChambreService {

    List<Chambre> retrieveAllFoyers();

    Chambre addFoyer (Chambre c);

    Chambre updateFoyer (Chambre c);

    Chambre retrieveFoyer (long  idChambre);

    void removeFoyer (long idChambre);

    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) ;

    public List<Chambre> getChambresParBlocEtType (long idBloc, TypeChambre typeC) ;

}
