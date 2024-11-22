package tn.esprit.spring.entite;

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

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
     long idUniversite;
     String nomUniversite;
     String adresse;

    // One Universite has many Foyers
    @OneToOne
     Foyer foyer;
}
