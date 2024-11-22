package com.example.workshop.repository;


import com.example.workshop.entite.Reservation;
import com.example.workshop.entite.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {


    Universite findByNomUniversiteLike(String nomu);


}
