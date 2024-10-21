package com.example.workshop.serviceImpl;

import com.example.workshop.entite.Bloc;
import com.example.workshop.entite.Chambre;
import com.example.workshop.entite.TypeChambre;
import com.example.workshop.repository.ChambreRepository;
import com.example.workshop.serviceInterface.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    private ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return List.of();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return null;
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return null;
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return null;
    }

    @Override
    public void removeChambre(long idChambre) {

    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        return null;
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return List.of();
    }
}
