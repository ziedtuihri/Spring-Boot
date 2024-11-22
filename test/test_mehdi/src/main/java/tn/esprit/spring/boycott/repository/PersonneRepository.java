package tn.esprit.spring.boycott.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.boycott.entity.Personne;
import tn.esprit.spring.boycott.entity.TypePersonne;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long>{
    Personne findByEmail(String email);
    List<Personne> findByArticlesCategoriesNomCategorieAndDateInscriAfterAndTypePersonne(String nomCategorie, LocalDate date, TypePersonne typePersonne);
}
