package com.example.workshop.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Categorie {

    @Id
    long idCat;

    String nomCat;

    String descCat;

    @OneToMany(mappedBy = "categorie")
    List<Produit> produits;
}
