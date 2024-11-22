package tn.esprit.spring.boycott.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.boycott.entity.Article;
import java.util.List;


@Repository
public interface ArticleRepository extends CrudRepository<Article, Long>{
    Article findByNomArticle(String nomArticle);
}
