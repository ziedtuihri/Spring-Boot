package com.example.workshop.serviceInterface;

import com.example.workshop.entite.Chambre;
import com.example.workshop.entite.Etudiant;
import com.example.workshop.entite.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {

    List<Reservation> retrieveAllReservation();

    Reservation addReservation (Reservation c);

    Reservation updateReservation (Reservation c);

    Reservation retrieveReservation (long  idReservation);

    void removeReservation (long idReservation);

    public Reservation annulerReservation (long cinEtudiant) ;

    public List<Reservation>  getReservationParAnneeUniversitaireEtNomUniversite(LocalDate anneeUniversite, String nomUniversite) ;

    public List<Reservation>  getReservationParAnneeUniversitaireEtNomUniversiteKeyWord(LocalDate anneeUniversite, String nomUniversite) ;


}
