package tn.esprit.spring.entite;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
     long idEtudiant;
     String nomEt;
     String prenomEt;
     long cin;
     String ecole;
     LocalDate dateNaissance;

    // One Etudiant can have many Reservations
    @ManyToMany(mappedBy = "etudiants")
    @JsonIgnore
    @ToString.Exclude
    List<Reservation> reservations;

}
