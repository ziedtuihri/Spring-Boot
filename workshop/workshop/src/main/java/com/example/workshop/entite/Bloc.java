package com.example.workshop.entite;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idBloc;
    String nomBloc;
    long capaciteBloc;

    // Many Blocs belong to one Foyer
    @ToString.Exclude
    @ManyToOne
    @JsonIgnore
    Foyer foyer;



    // One Bloc has many Chambres
}
