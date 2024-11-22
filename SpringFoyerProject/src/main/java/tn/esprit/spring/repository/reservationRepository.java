package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entite.Reservation;

@Repository
public interface reservationRepository extends JpaRepository<Reservation , String> {
}
