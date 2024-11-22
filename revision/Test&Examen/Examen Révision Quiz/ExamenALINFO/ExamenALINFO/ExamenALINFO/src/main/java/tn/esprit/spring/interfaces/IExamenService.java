package tn.esprit.spring.interfaces;


import tn.esprit.spring.entities.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;

public interface IExamenService {
    public Candidat ajouterCandidat(Candidat candidat);
    public Quiz ajouterQuiz(Quiz quiz);
    public Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat);
    public Question ajouterQuestionEtReponseEtAffecterQuestionQuiz(Question question, Integer idQuiz);
    public List<Candidat> recupererCandidatParNiveauEtSpecialiteQuizEtDateQuiz(String specialite, Niveau niveau);
    public void recupererQuizPlusDifficile();
}

