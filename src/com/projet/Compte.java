package com.projet;

public class Compte {
    private int id;
    private String num;
    private String nom;

    public Compte(){

    }
    public Compte(int id,String num,String nom){
        this.id = id;
        this.num = num;
        this.nom = nom;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNum(){
        return this.num;
    }
    public void setNum(String num){
        this.num = num;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
}
