package com.example.workshop.entite;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idFoyer;
    String nomFoyer;
    long capaciteFoyer;

    // Many Foyers belong to one Universite
    @OneToOne(mappedBy = "foyer")
    Universite universite;

    // One Foyer has many Blocs
    @OneToMany(mappedBy = "foyer")
    List<Bloc> blocs;


}
