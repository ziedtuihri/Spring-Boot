package tn.esprit.spring.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Chambre;
import tn.esprit.spring.entite.TypeChambre;
import tn.esprit.spring.repository.chambreRepository;
import tn.esprit.spring.serviceInterface.IChambreService;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    private chambreRepository cRepository;
    @Override
    public List<Chambre> retrieveAllFoyers() {
        return cRepository.findAll();
    }

    @Override
    public Chambre addFoyer(Chambre c) {
        return cRepository.save(c);
    }

    @Override
    public Chambre updateFoyer(Chambre c) {
        return cRepository.save(c);
    }

    @Override
    public Chambre retrieveFoyer(long idChambre) {
        return cRepository.findById(idChambre).orElse(null);
    }

    @Override
    public void removeFoyer(long idChambre) {
        cRepository.deleteById(idChambre);
    }

    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
            return cRepository.findByBlocIdBlocAndTypeC(idBloc, typeC);

    }
}
