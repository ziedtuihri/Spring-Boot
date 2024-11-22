package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entite.Chambre;
import tn.esprit.spring.entite.TypeChambre;

import java.util.List;


@Repository
public interface chambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findByNumeroChambreIn(List<Long> numChambre);

    //@Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeC = :typeC")
    //List<Chambre> findChambresByBlocAndType(@Param("idBloc") long idBloc, @Param("typeC") TypeChambre typeC);
    List<Chambre> findByBlocIdBlocAndTypeC(long idBloc, TypeChambre typeC);
}
