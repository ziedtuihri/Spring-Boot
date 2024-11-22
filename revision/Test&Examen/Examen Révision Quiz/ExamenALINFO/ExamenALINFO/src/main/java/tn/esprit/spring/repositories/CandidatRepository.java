package tn.esprit.spring.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Candidat;
import tn.esprit.spring.entities.Niveau;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CandidatRepository extends CrudRepository<Candidat, Integer> {


    List<Candidat> findByNomLike(String nom);

    List<Candidat>
    findByNiveauAndQuizListSpecialiteAndQuizListDateQuizAfter(Niveau niveau, String specialite, LocalDate dateQuiz);

}
