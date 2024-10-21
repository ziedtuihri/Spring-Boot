package com.example.workshop.repository;

import com.example.workshop.entite.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, String> {


}
