package tn.esprit.donation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Entreprise implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntreprise;
    @NonNull
    private String nomEntreprise;

    private String adresse;
   @JsonIgnore
    @OneToMany(mappedBy = "entreprise")
    private Set<Employe> employes;
}
