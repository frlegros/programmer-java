package chp28.patterns.structure.composite;

import java.util.ArrayList;

/**
 * Created by frlegros on 23/03/17.
 */
public class Groupe extends Composant{

    private ArrayList<Composant> listeComposant = new ArrayList<Composant>();

    public Groupe(String nom) {
        super(nom);
    }

    @Override
    public void ajoute(Composant c){listeComposant.add(c);}

    public void affiche(){

        System.out.println("----- Groupe "+getNom()+" contenant: ");
        for (Composant c:listeComposant){
            c.affiche();
        }
        System.out.println("----- Fin groupe "+getNom());
    }
}
