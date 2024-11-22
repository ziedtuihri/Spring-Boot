package tn.esprit.spring.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Bloc;
import tn.esprit.spring.entite.Chambre;
import tn.esprit.spring.entite.Foyer;
import tn.esprit.spring.entite.Universite;
import tn.esprit.spring.repository.UniversiteRepository;
import tn.esprit.spring.repository.foyerRepository;
import tn.esprit.spring.serviceInterface.IUniversiteService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    UniversiteRepository universiteRepository;
    foyerRepository FoyerRepository;
    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite c) {
        return universiteRepository.save(c);
    }

    @Override
    public Universite updateUniversite(Universite c) {
        return universiteRepository.save(c);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void removeUniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer f = FoyerRepository.findById(idFoyer).orElse(null);
        if (f == null) {
            throw new RuntimeException("Foyer with ID " + idFoyer + " not found");
        }

        Universite u = universiteRepository.findByNomUniversiteLike(nomUniversite);
        if (u == null) {
            throw new RuntimeException("Universite with name " + nomUniversite + " not found");
        }

        u.setFoyer(f);
        return universiteRepository.save(u);
    }

    public Universite desaffecterFoyerAUniversite(long idUniversite) {

        Universite u = universiteRepository.findById(idUniversite).orElse(null);

        if (u != null) {
            u.setFoyer(null);
            universiteRepository.save(u);
        }
        return u;
    }

    @Override
    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {

        Universite universite = universiteRepository.findByNomUniversiteLike(nomUniversite);
        if (universite != null && universite.getFoyer() != null) {
            List<Bloc> blocs = universite.getFoyer().getBlocs();
            List<Chambre> chambres = new ArrayList<>();
            for (Bloc bloc : blocs) {
                chambres.addAll(bloc.getChambreList());
            }
            return chambres;
        } else {
            return Collections.emptyList();
        }
    }
}
