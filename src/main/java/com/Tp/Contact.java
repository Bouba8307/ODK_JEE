package com.Tp;

public class Contact {
    private int id;
    private String nom;
    private String numeroTelephone;
    private String email;
    private String adresse;
    private String competenceFavorite;

    public Contact(int id, String nom, String numeroTelephone, String email, String adresse, String competenceFavorite) {
        this.id = id; // Ajout de cette ligne pour initialiser l'id
        this.nom = nom;
        this.numeroTelephone = numeroTelephone;
        this.email = email;
        this.adresse = adresse;
        this.competenceFavorite = competenceFavorite;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCompetenceFavorite() {
        return competenceFavorite;
    }

    public void setCompetenceFavorite(String competenceFavorite) {
        this.competenceFavorite = competenceFavorite;
    }
}
