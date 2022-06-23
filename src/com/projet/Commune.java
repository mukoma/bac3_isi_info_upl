package com.projet;

import java.util.ArrayList;
import java.util.List;

public class Commune {
    private int id;
    private String nom;
    private List<Salle> listeSalles;

    public Commune(int id,String nom){
        this.id = id;
        this.nom = nom;
        Salle salle1  = new Salle(1,"katuba",250);
        Salle salle2  = new Salle(1,"gecamines",650);
        List<Salle> listeSalles= new ArrayList<>();
        listeSalles.add(salle1);
        listeSalles.add(salle2);
        this.listeSalles = listeSalles;
    }
    public List<Salle> getListeSalles(){
        return this.listeSalles;
    }
    public void setListeSalles(List<Salle>listeSalles){
        this.listeSalles = listeSalles;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

}
