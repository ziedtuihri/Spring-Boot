package tn.esprit.spring.serviceInterface;

import tn.esprit.spring.entite.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation (Reservation c);

    Reservation updateReservation (Reservation c);

    Reservation retrieveReservation (String  idReservation);

    void removeReservation (String idReservation);
     Reservation ajouterReservation(long idChambre, long cinEtudiant);
}
