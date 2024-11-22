package com.example.workshop.serviceImpl;

import com.example.workshop.entite.Chambre;
import com.example.workshop.entite.Etudiant;
import com.example.workshop.entite.Reservation;
import com.example.workshop.repository.ChambreRepository;
import com.example.workshop.repository.EtudiantRepository;
import com.example.workshop.repository.ReservationRepository;
import com.example.workshop.repository.UniversiteRepository;
import com.example.workshop.serviceInterface.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {


    ReservationRepository reservationRepository;
    EtudiantRepository etudiantRepository;
    ChambreRepository chambreRepository;
    UniversiteRepository universiteRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return List.of();
    }

    @Override
    public Reservation addReservation(Reservation c) {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation c) {
        return null;
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return null;
    }

    @Override
    public void removeReservation(long idReservation) {

    }

    private String generateId(long numChambre, String nomBloc) {
        return numChambre + "-" + nomBloc + "-" + LocalDate.now().getYear();
    }

    private boolean capaciteChambreMaximale(Chambre chambre) {
        switch (chambre.getTypeC()) {
            case SIMPLE -> {
                return chambre.getReservations().size() < 2;
            }
            case DOUBLE -> {
                return chambre.getReservations().size() < 3;
            }
            case TRIPLE -> {
                return chambre.getReservations().size() < 4;
            }
            default -> {
                return false;
            }
        }
    }



    @Override
    public Reservation annulerReservation(long cinEtudiant) {
        return null;
    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(LocalDate anneeUniversite, String nomUniversite) {
        return List.of();
    }

    @Override
    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversiteKeyWord(LocalDate anneeUniversite, String nomUniversite) {
        return List.of();
    }


}
