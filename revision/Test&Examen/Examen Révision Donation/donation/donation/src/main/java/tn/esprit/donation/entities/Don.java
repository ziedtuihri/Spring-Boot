package tn.esprit.donation.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Don implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDon;
    private double montant;
    //@Temporal(TemporalType.DATE)
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private TypeDons type;
    @JsonIgnore
    @ManyToOne
    private Employe employe;
}
