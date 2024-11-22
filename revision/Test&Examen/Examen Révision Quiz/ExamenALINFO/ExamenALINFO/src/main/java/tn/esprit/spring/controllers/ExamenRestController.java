package tn.esprit.spring.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Candidat;
import tn.esprit.spring.entities.Niveau;
import tn.esprit.spring.entities.Question;
import tn.esprit.spring.entities.Quiz;
import tn.esprit.spring.interfaces.IExamenService;

import java.util.List;

//@Tag(name = "Contrat")
@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/examen")
public class ExamenRestController {
    @GetMapping("/getByNiveauEtSpecialite/{specialite}/{niveau}")
    public List<Candidat> recupererCandidatParNiveauEtSpecialiteQuizEtDateQuiz(@PathVariable String specialite, @PathVariable Niveau niveau) {
        return examenService.recupererCandidatParNiveauEtSpecialiteQuizEtDateQuiz(specialite, niveau);
    }





    IExamenService examenService;

    @PostMapping("/ajouterCandidat")
    public Candidat ajouterCandidat(@RequestBody Candidat candidat) {
        return examenService.ajouterCandidat(candidat);
    }

    @PostMapping("/ajouterQuiz")
    public Quiz ajouterQuiz(@RequestBody Quiz quiz) {
        return examenService.ajouterQuiz(quiz);
    }

    @PostMapping("/affecterQuizCandidat/{titreQuiz}/{candidatId}")
    public Quiz affecterQuizCandidat(@PathVariable("titreQuiz")
                                     String quizTitle,
                                     @PathVariable("candidatId") Integer candidatId) {
        return examenService.affecterQuizCandidat(quizTitle,
                candidatId);
    }

    @PostMapping("/ajouterQuestionEtReponseEtAffecterQuestionQuiz/{id}")
    public Question ajouterQuestionEtReponseEtAffecterQuestionQuiz(
            @RequestBody Question question,
            @PathVariable("id") Integer idQuiz) {
        return examenService.ajouterQuestionEtReponseEtAffecterQuestionQuiz(question, idQuiz);
    }

//    @GetMapping("/recupererCandidatParNiveauEtSpecialiteQuizEtDateQuiz/{specialite}/{niveau}")
//    public List<Candidat> recupererCandidatParNiveauEtSpecialiteQuizEtDateQuiz(@PathVariable("specialite") String specialite,
//                                                                               @PathVariable("niveau") Niveau niveau) {
//        return examenService.recupererCandidatParNiveauEtSpecialiteQuizEtDateQuiz(specialite, niveau);
//    }

}


