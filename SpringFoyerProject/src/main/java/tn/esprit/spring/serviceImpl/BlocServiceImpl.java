package tn.esprit.spring.serviceImpl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Bloc;
import tn.esprit.spring.entite.Chambre;
import tn.esprit.spring.repository.blocRepository;
import tn.esprit.spring.repository.chambreRepository;
import tn.esprit.spring.serviceInterface.IBlocService;

import java.util.List;
@AllArgsConstructor
@Service
@Slf4j
public class BlocServiceImpl implements IBlocService {
    blocRepository bRepository;
    chambreRepository CRepository;
    @Override
    public List<Bloc> retrieveAllBloc() {
        return bRepository.findAll();
    }

    @Override
    public Bloc addFoyer(Bloc b) {
        return bRepository.save(b);
    }

    @Override
    public Bloc updateFoyer(Bloc b) {
        return bRepository.save(b);
    }

    @Override
    public Bloc retrieveFoyer(long idBloc) {
        return bRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeFoyer(long idBloc) {
        bRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getBlockByNomUniv(String uni) {
        return bRepository.findByFoyerUniversiteNomUniversiteLike(uni);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {

        Bloc bloc = bRepository.findById(idBloc).orElse(null);
        List<Chambre> chambres = CRepository.findByNumeroChambreIn(numChambre);
        if (chambres.isEmpty()) {
            throw new RuntimeException("Aucune chambre trouvée avec les numéros fournis : " + numChambre);
        }

        for (Chambre chambre : chambres) {
            chambre.setBloc(bloc);
            CRepository.save(chambre);
            log.info(chambre.toString());
        }
        //assert bloc != null;
        //bloc.setChambreList(chambres);
        //bRepository.save(bloc);
        return bloc;
    }


}
