package com.example.workshop.entite;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

//@Table(name = "ChambreTable")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idChambre;

    long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeC;

    @ManyToOne
    Bloc bloc;

    // One Chambre has many Reservations
    @OneToMany
    List<Reservation> reservations;

}
