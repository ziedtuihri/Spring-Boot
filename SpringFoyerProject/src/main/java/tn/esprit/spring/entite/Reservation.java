package tn.esprit.spring.entite;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    //@Setter(AccessLevel.NONE)
     String idReservation;
     LocalDate anneeUniversitaire;
     boolean estValide;

    // Many Reservations belong to one Etudiant
    @ManyToMany
    @ToString.Exclude
    @JsonIgnore
     List<Etudiant> etudiants = new ArrayList<>();



}
