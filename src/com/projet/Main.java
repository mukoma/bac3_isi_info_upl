package com.projet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Compte cpt = new Compte(1,"AA-002-T","ISAAC");
        Reservation res = new Reservation(1,new Date(),"PREMIUM",cpt);

        System.out.println("le num de compte de reservation est : "+res.getNumCpt() );

        Salle salle1 = new Salle(1,"golf",350);
        Salle salle2 = new Salle(2,"katuba",550);
        List<Salle>listeSalles = new ArrayList<>();
        listeSalles.add(salle1);
        listeSalles.add(salle2);
        Commune commune1 = new Commune(1,"annexe",listeSalles);
        //System.out.println("La 2ere salle de la commune1 est "+commune1.getListeSalles().get(1).getAdresse());
        for(int i=0;i<commune1.getListeSalles().size();i++){
            System.out.println("La salle No "+i+" de la commune 1 est "+commune1.getListeSalles().get(i).getAdresse());
        }
    }
}
