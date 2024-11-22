package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entite.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiant();

    Etudiant addEtudiant (Etudiant c);

    Etudiant updateEtudiant (Etudiant c);

    Etudiant retrieveEtudiant (long  idEtudiant);

    void removeEtudiant (long idEtudiant);
}
