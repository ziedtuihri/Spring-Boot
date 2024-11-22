package com.example.workshop.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    @Setter(AccessLevel.NONE)
    String idReservation;
    LocalDate anneeUniversitaire;
    boolean estValide;

    // Many Reservations belong to one Etudiant
    @ManyToMany
    Set<Etudiant> etudiants;

}
