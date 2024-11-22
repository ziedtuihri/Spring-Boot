package tn.esprit.donation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.donation.entities.CroissantRouge;
import tn.esprit.donation.entities.Employe;

import java.util.List;

public interface CroissantRougeRepository extends JpaRepository<CroissantRouge,Long> {



}
