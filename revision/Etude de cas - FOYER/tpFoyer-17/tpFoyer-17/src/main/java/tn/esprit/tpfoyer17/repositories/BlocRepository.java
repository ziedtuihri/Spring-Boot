package tn.esprit.tpfoyer17.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer17.entities.Bloc;
import tn.esprit.tpfoyer17.entities.Universite;

import java.util.List;

@Repository
public interface BlocRepository extends CrudRepository<Bloc, Long> {

    List<Bloc> findByFoyerUniversiteAdresse(String adres);

    List<Bloc> findByFoyerUniversiteNomUniversiteLike(String nom);

    List<Bloc> findByFoyerNomFoyerLikeAndFoyerUniversiteNomUniversiteLike(String nomFoyer, String nomUniversite);

    List<Bloc> findByFoyerIdFoyer(long idFoyer);

    Bloc findByChambresIdChambre(Long idChambre);

    List<Bloc> findByFoyerNomFoyerLikeAndFoyerUniversiteAdresseLike(String nomFoyer, String adresse);
}
