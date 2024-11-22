package tn.esprit.spring.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Bloc;
import tn.esprit.spring.entite.Foyer;
import tn.esprit.spring.entite.Universite;
import tn.esprit.spring.repository.UniversiteRepository;
import tn.esprit.spring.repository.blocRepository;
import tn.esprit.spring.repository.foyerRepository;
import tn.esprit.spring.serviceInterface.IFoyerService;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {

    foyerRepository fRepository;
    UniversiteRepository universiteRepository;
    blocRepository bRepository;
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

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {
        fRepository.save(foyer);
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        assert universite != null;
        universite.setFoyer(foyer);
        universiteRepository.save(universite);
        List<Bloc> blocs = foyer.getBlocs();
        if (blocs != null) {
            for (Bloc bloc : blocs) {
                bloc.setFoyer(foyer);
                bRepository.save(bloc);
            }
        }
        return fRepository.save(foyer);
    }

}
