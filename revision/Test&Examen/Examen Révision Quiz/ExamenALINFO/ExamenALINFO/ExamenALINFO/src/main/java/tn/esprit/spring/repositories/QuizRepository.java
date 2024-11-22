package tn.esprit.spring.repositories;


import com.sun.deploy.util.OrderedHashSet;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Complexite;
import tn.esprit.spring.entities.Quiz;

import javax.persistence.OrderBy;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Integer> {

    Quiz findByTitreLike(String titre);






Integer countByQuestionListComplexiteAndIdQuiz(Complexite complexite , Integer idQuiz);
    List<Integer> countByQuestionListComplexite(Complexite complexite);

}
