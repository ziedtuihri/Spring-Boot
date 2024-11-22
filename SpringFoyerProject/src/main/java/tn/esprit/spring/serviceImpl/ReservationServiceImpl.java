package tn.esprit.spring.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Chambre;
import tn.esprit.spring.entite.Etudiant;
import tn.esprit.spring.entite.Reservation;
import tn.esprit.spring.entite.TypeChambre;
import tn.esprit.spring.repository.chambreRepository;
import tn.esprit.spring.repository.etudiantRepository;
import tn.esprit.spring.repository.reservationRepository;
import tn.esprit.spring.serviceInterface.IReservationService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
     reservationRepository rRepository;
     chambreRepository cRepository;
    etudiantRepository eRepository ;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return rRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation c) {
        return rRepository.save(c);
    }

    @Override
    public Reservation updateReservation(Reservation c) {
        return rRepository.save(c);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return rRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(String idReservation) {
        rRepository.deleteById(idReservation);
    }

    @Override
    public Reservation ajouterReservation(long idChambre, long cinEtudiant) {

        Chambre chambre = cRepository.findById(idChambre).orElse(null);
        Etudiant etudiant = eRepository.findByCin(cinEtudiant);

        assert chambre != null;
        int maxCapacity = getMaxCapacityForChambre(chambre.getTypeC());
        if (chambre.getReservations().size() >= maxCapacity) {
            throw new RuntimeException("La capacité maximale de la chambre est atteinte");
        }
        String numReservation = generateReservationNumber(chambre, LocalDate.now());
        Reservation reservation = Reservation.builder()
                .idReservation(numReservation)
                .anneeUniversitaire(LocalDate.now())
                .estValide(true)
                .build();

        if (reservation.getEtudiants() == null) {
            reservation.setEtudiants(new ArrayList<>()); // Initialiser la liste si elle est null
        }
        reservation.getEtudiants().add(etudiant);
        chambre.getReservations().add(reservation);
        return rRepository.save(reservation);
    }
    private String generateReservationNumber(Chambre chambre, LocalDate anneeUniversitaire) {
        return chambre.getNumeroChambre() + "-" + chambre.getBloc().getNomBloc() + "-" + anneeUniversitaire.getYear();
    }
    private int getMaxCapacityForChambre(TypeChambre typeC) {
        return switch (typeC) {
            case SIMPLE -> 1;
            case DOUBLE -> 2;
            case TRIPLE -> 3;
        };
    }
}
