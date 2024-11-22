package com.example.workshop.serviceImpl;

import com.example.workshop.entite.Foyer;
import com.example.workshop.entite.Universite;
import com.example.workshop.repository.FoyerRepository;
import com.example.workshop.repository.UniversiteRepository;
import com.example.workshop.serviceInterface.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {

    private UniversiteRepository universiteRepository;

    private FoyerRepository foyerRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return List.of();
    }

    @Override
    public Universite addUniversite(Universite c) {
        return null;
    }

    @Override
    public Universite updateUniversite(Universite c) {
        return null;
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return null;
    }

    @Override
    public void removeUniversite(long idUniversite) {

    }

    @Override
    public Universite affecterFoyerUniversite(long idFoyer, String nomUniversite) {
        return null;
    }

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        return null;
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        // Foyer foyer = foyerRepository.findById(idFoyer).orElse(null);
        universite.setFoyer(null);
        return  universiteRepository.save(universite);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).orElse(null);
        Universite universite = universiteRepository.findByNomUniversiteLike(nomUniversite);
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }
}
