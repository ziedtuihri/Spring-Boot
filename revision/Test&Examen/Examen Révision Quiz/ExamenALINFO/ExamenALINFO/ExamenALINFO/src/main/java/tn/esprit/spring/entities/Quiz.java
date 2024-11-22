package tn.esprit.spring.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Quiz implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idQuiz;
    private String titre;
    private String specialite;

    private LocalDate dateQuiz;
    //private Complexite complexite;
    @ToString.Exclude
   @JsonIgnore
@ManyToMany
    List<Candidat> candidatList = new ArrayList<>();





    @JsonIgnore
    @ToString.Exclude
    @OneToMany(mappedBy = "quiz" , fetch=FetchType.EAGER)
    List<Question> questionList = new ArrayList<>() ;



}
