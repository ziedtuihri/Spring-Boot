package com.example.workshop.entite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Produit {



    @Id
    long idProduit;

    String nomProduit;

    String prixProduit;

    @ManyToOne
    Categorie categorie;

}
