package tn.esprit.spring.boycott.service;

import java.time.LocalDate;
import java.util.List;

import tn.esprit.spring.boycott.entity.Article;
import tn.esprit.spring.boycott.entity.Personne;
import tn.esprit.spring.boycott.entity.TypePersonne;

public interface IExamenService {
    Personne ajouterPersonne(Personne p);

    Article ajouterArticleEtCategories(Article a);

    void affecterArticleAPersonne(String nomArticle, String email);

    boolean chercherArticle(String nomArticle);

    List<Personne> recupererPersonnessParCriteres(String nomCategorie, LocalDate d,
            TypePersonne tp);

    void afficherEtMettreAJourArticles();
}
