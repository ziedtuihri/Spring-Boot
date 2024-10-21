package com.example.workshop.serviceImpl;

import com.example.workshop.entite.Foyer;
import com.example.workshop.repository.FoyerRepository;
import com.example.workshop.serviceInterface.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {

    private FoyerRepository fRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return fRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return fRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return fRepository.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return fRepository.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        fRepository.deleteById(idFoyer);
    }
}
