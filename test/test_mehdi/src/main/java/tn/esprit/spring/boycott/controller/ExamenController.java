package tn.esprit.spring.boycott.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.esprit.spring.boycott.entity.Article;
import tn.esprit.spring.boycott.entity.Personne;
import tn.esprit.spring.boycott.entity.TypePersonne;
import tn.esprit.spring.boycott.service.IExamenService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@AllArgsConstructor
public class ExamenController {

    IExamenService examenService;

    @PostMapping("ajouterPersonne")
    public Personne ajopuitPersonne(@RequestBody Personne p) {        
        return examenService.ajouterPersonne(p);
    }


    @PostMapping("ajouterArticleEtCategories")
    public Article ajouterArticleEtCategories(@RequestBody Article article) {    
        return examenService.ajouterArticleEtCategories(article);
    }

    @PutMapping("affecterArticleAPersonne/{nomArticle}/{email}")
    public void affecterArticleAPersonne(@PathVariable String nomArticle, @PathVariable String email) {
        examenService.affecterArticleAPersonne(nomArticle, email);
    }

    @GetMapping("chercherArticle/{nomArticle}")
    public boolean chercherArticle(@RequestParam String nomArticle) {
        return examenService.chercherArticle(nomArticle);
    }

    @GetMapping("recupererPersonnessParCriteres/{nomCategorie}/{date}/{type}")
    public List<Personne> recupererPersonnessParCriteres(@PathVariable String nomCategorie, @PathVariable LocalDate date, @PathVariable TypePersonne type) {
        return examenService.recupererPersonnessParCriteres(nomCategorie, date, type);
    }
    
    
    
    
}
