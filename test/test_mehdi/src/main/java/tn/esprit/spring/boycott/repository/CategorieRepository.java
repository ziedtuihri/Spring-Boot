package tn.esprit.spring.boycott.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.boycott.entity.Categorie;

@Repository
public interface CategorieRepository  extends CrudRepository<Categorie, Long>{
    
}
