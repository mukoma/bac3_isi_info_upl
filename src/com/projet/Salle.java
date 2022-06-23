package com.projet;

public class Salle {
    private int id;
    private String adresse;
    private int capacite;

    public Salle(int id,String adresse,
                 int capacite){
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;

    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public int getCapacite(){
        return this.capacite;
    }
    public void setCapacite(int capacite){
        this.capacite = capacite;
    }
}
