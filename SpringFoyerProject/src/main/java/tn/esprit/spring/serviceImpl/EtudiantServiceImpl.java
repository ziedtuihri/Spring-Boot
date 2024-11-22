package tn.esprit.spring.serviceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entite.Etudiant;
import tn.esprit.spring.repository.etudiantRepository;
import tn.esprit.spring.serviceInterface.IEtudiantService;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {
    private etudiantRepository eRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return eRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant c) {
        return eRepository.save(c);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant c) {
        return eRepository.save(c);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return eRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        eRepository.deleteById(idEtudiant);

    }
}
