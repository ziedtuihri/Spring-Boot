package tn.esprit.spring.repositories;


import net.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Candidat;
import tn.esprit.spring.entities.Niveau;
import tn.esprit.spring.entities.Quiz;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CandidatRepository extends
        CrudRepository<Candidat, Integer> {
List<Candidat> findByNomLike(String nom);
    List<Candidat>
    findByNiveauLikeAndQuizListSpecialiteLikeAndQuizListDateQuizAfter(Niveau niveau, String specialite, LocalDate dateQuiz);

}
