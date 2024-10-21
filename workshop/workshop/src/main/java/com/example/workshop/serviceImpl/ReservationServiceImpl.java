package com.example.workshop.serviceImpl;

import com.example.workshop.entite.Reservation;
import com.example.workshop.repository.ReservationRepository;
import com.example.workshop.serviceInterface.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return List.of();
    }

    @Override
    public Reservation addReservation(Reservation c) {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation c) {
        return null;
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return null;
    }

    @Override
    public void removeReservation(long idReservation) {

    }
}
