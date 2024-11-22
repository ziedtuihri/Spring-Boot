package tn.esprit.spring.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.*;
import tn.esprit.spring.interfaces.IExamenService;
import tn.esprit.spring.repositories.CandidatRepository;
import tn.esprit.spring.repositories.QuestionRepository;
import tn.esprit.spring.repositories.QuizRepository;
import tn.esprit.spring.repositories.ReponseRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ExamenServiceImpl implements IExamenService {
    CandidatRepository candidatRepository;
    QuestionRepository questionRepository;
    QuizRepository quizRepository;
    ReponseRepository reponseRepository;


    @Override
    public Candidat ajouterCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    @Override
    public Quiz ajouterQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Transactional
    public Quiz affecterQuizCandidat(String titreQuiz,
                                     Integer idCandidat) {
        //1//
        Candidat candidat =candidatRepository.findById(idCandidat).orElse(null);
        Quiz quiz = quizRepository.findByTitreLike(titreQuiz);
        //2//

        quiz.getCandidatList().add(candidat);
        quizRepository.save(quiz);

        //3//
        assert candidat != null;
        candidat.setNbQuiz(candidat.getNbQuiz()+1); //candidat nb quiz + 1
        candidatRepository.save(candidat);
        return quiz;
    }

    @Transactional
    public Question ajouterQuestionEtReponseEtAffecterQuestionQuiz(
            Question question, Integer idQuiz) {
        Quiz quiz = quizRepository.findById(idQuiz).orElse(null);
        question.setQuiz(quiz);
        return questionRepository.save(question);
    }










    @Override
    public List<Candidat> recupererCandidatParNiveauEtSpecialiteQuizEtDateQuiz(String specialite, Niveau niveau) {
        LocalDate dateQuiz = LocalDate.now();
        return candidatRepository.findByNiveauAndQuizListSpecialiteAndQuizListDateQuizAfter(niveau, specialite,dateQuiz);
    }







      //@Scheduled(cron = "*/5 * * * * *")
      @Override
      public void recupererQuizPlusDifficile() {
          List<Quiz> quizList = (List<Quiz>) quizRepository.findAll();

          if (quizList.isEmpty()) {
              return;
          }

          Quiz difficile = quizList.get(0);
          int nbDifficile = quizRepository.countByQuestionListComplexiteAndIdQuiz(Complexite.DIFFICILE, difficile.getIdQuiz());

          for (Quiz quiz : quizList) {
              int currentDifficileCount = quizRepository.countByQuestionListComplexiteAndIdQuiz(Complexite.DIFFICILE, quiz.getIdQuiz());

              if (currentDifficileCount > nbDifficile) {
                  nbDifficile = currentDifficileCount;
                  difficile = quiz;
              }
          }

          log.info("Le quiz le plus difficile est " + difficile.getTitre() + " avec " + nbDifficile + " questions difficiles.");
      }





}
