package com.example.workshop.serviceImpl;

import com.example.workshop.entite.Bloc;
import com.example.workshop.entite.Foyer;
import com.example.workshop.repository.BlocRepository;
import com.example.workshop.repository.FoyerRepository;
import com.example.workshop.serviceInterface.IBlocService;
import com.example.workshop.serviceInterface.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

    private BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getBlocByNameUniv(String name) {
        return List.of();
    }

}
