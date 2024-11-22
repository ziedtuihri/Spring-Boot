package tn.esprit.spring.boycott.service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.boycott.entity.Article;
import tn.esprit.spring.boycott.entity.Etat;
import tn.esprit.spring.boycott.entity.Personne;
import tn.esprit.spring.boycott.entity.TypePersonne;
import tn.esprit.spring.boycott.repository.ArticleRepository;
import tn.esprit.spring.boycott.repository.CategorieRepository;
import tn.esprit.spring.boycott.repository.PersonneRepository;

@AllArgsConstructor
@Slf4j
@Service
public class ExamenServiceImpl implements IExamenService {
    PersonneRepository personneRepository;
    ArticleRepository articleRepository;
    CategorieRepository categorieRepository;

    @Override
    public Personne ajouterPersonne(Personne p) {
        return personneRepository.save(p);
    }

    @Override
    public Article ajouterArticleEtCategories(Article a) {
       return articleRepository.save(a);
    }

    @Override
    public void affecterArticleAPersonne(String nomArticle, String email) {
        Personne personne = personneRepository.findByEmail(email);
        Article article = articleRepository.findByNomArticle(nomArticle);

        personne.getArticles().add(article);

         personneRepository.save(personne);
    }

    @Override
    public boolean chercherArticle(String nomArticle) {
        Article article = articleRepository.findByNomArticle(nomArticle);
        return article != null && article.getEtat().name().equals(Etat.BOYCOTT.name());
    }

    @Override
    public List<Personne> recupererPersonnessParCriteres(String nomCategorie, LocalDate d, TypePersonne tp) {
        return personneRepository.findByArticlesCategoriesNomCategorieAndDateInscriAfterAndTypePersonne(nomCategorie, d, tp);
    }

    @Override
    public void afficherEtMettreAJourArticles() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afficherEtMettreAJourArticles'");
    }
}
