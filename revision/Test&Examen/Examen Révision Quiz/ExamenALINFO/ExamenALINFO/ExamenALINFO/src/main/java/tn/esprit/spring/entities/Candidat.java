package tn.esprit.spring.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Candidat implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idCandidat;

    private String prenom;
    private String nom;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;



    private Integer nbQuiz;
    @ToString.Exclude
    @JsonIgnore
    @ManyToMany(mappedBy = "candidatList")
    List<Quiz> quizList = new ArrayList<>();

}
