package tn.esprit.spring.entite;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
            @JsonIgnore
            @ToString.Exclude
     Bloc bloc;

    // One Chambre has many Reservations
    @OneToMany
    @JsonIgnore
    @ToString.Exclude
     List<Reservation> reservations;
}
