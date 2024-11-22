package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entite.Chambre;
import tn.esprit.spring.entite.TypeChambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllFoyers();

    Chambre addFoyer (Chambre c);

    Chambre updateFoyer (Chambre c);

    Chambre retrieveFoyer (long  idChambre);

    void removeFoyer (long idChambre);

    List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC);
}
