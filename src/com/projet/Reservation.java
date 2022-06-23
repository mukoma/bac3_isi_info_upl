package com.projet;


import java.util.Date;

public class Reservation {
    private int id;
    private Date date;
    private String typeSalle;
    private String numCpt;

    public Reservation(){

    }
    public Reservation(int id,Date date,
                       String typeSalle,
                       Compte numCompte){
        this.id = id;
        this.date = date;
        this.typeSalle = typeSalle;
        this.numCpt = numCompte.getNum();
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public Date getDate(){
        return this.date;
    }
    public void setDate(Date date){
        this.date =date;
    }
    public String getTypeSalle(){
        return this.typeSalle;
    }
    public void setTypeSalle(String typeSalle){
        this.typeSalle = typeSalle;
    }
    public String getNumCpt(){
        return this.numCpt;
    }
    public void setNumCpt(String numCpt){
        this.numCpt = numCpt;
    }



}
