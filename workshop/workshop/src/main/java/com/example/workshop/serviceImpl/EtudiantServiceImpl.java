package com.example.workshop.serviceImpl;

import com.example.workshop.entite.Etudiant;
import com.example.workshop.repository.EtudiantRepository;
import com.example.workshop.serviceInterface.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    private EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return List.of();
    }

    @Override
    public Etudiant addEtudiant(Etudiant c) {
        return null;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant c) {
        return null;
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return null;
    }

    @Override
    public void removeEtudiant(long idEtudiant) {

    }
}
