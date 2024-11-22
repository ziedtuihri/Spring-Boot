package tn.esprit.spring.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reponse implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idReponse;
    private String libelle;



}
