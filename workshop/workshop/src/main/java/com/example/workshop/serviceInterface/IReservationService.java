package com.example.workshop.serviceInterface;

import com.example.workshop.entite.Reservation;

import java.util.List;

public interface IReservationService {

    List<Reservation> retrieveAllReservation();

    Reservation addReservation (Reservation c);

    Reservation updateReservation (Reservation c);

    Reservation retrieveReservation (long  idReservation);

    void removeReservation (long idReservation);

}
