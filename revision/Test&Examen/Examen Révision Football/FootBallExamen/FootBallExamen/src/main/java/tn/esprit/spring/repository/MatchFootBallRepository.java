package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.MatchFootball;

@Repository
public interface MatchFootBallRepository extends JpaRepository<MatchFootball, Integer> {

}
