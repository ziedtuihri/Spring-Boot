package tn.esprit.spring.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Complexite;
import tn.esprit.spring.entities.Quiz;

import java.util.List;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Integer> {

    Quiz findByTitreLike(String titre);


    Integer countByQuestionListComplexiteAndIdQuiz(Complexite complexite, Integer idQuiz);

    List<Integer> countByQuestionListComplexite(Complexite complexite);

}
