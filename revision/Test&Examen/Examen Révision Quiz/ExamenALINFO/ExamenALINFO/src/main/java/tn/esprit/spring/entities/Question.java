package tn.esprit.spring.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idQuestion;
    private String libelle;
    private Complexite complexite;

    @ToString.Exclude
    @JsonIgnore
    @ManyToOne
    Quiz quiz;


    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @ToString.Exclude
    List<Reponse> reponseList;
}
