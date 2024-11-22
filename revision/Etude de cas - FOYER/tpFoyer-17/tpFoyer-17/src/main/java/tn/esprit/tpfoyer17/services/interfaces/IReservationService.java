package tn.esprit.tpfoyer17.services.interfaces;


import tn.esprit.tpfoyer17.entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation updateReservation(Reservation res);

    Reservation retrieveReservation(String idReservation);

    Reservation ajouterReservation(long idChambre, long cinEtudiant);

    Reservation annulerReservation(long cinEtudiant);

    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(LocalDate anneeUniversite, String nomUniversite);

    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversiteKeyWord(LocalDate anneeUniversite, String nomUniversite);

}
