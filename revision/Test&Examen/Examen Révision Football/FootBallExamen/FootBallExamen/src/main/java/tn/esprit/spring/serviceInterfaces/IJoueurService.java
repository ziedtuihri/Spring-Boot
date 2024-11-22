package tn.esprit.spring.serviceInterfaces;

import java.util.List;

import tn.esprit.spring.entities.Division;
import tn.esprit.spring.entities.Joueur;
import tn.esprit.spring.entities.Poste;

public interface IJoueurService {
	public Joueur ajouterJoueurEtAffecterEquipe(Joueur joueur, Integer idEquipe);

	public List<Joueur> afficherJoueursParPosteEtTaille(Poste poste, float taille);

	public List<Joueur> afficherJoueursDuMatchParDivisionEtPoste(Division division, Poste poste, Integer idMatch);

	public void afficherJoueursPolyvalentsDisponibles();
}
