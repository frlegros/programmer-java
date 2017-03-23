package chp28.patterns.structure.composite;

/**
 * Created by frlegros on 23/03/17.
 */
public class Cercle extends Composant{

    public Cercle(String nom) {
        super(nom);
    }

    public void affiche(){
        System.out.println("Cercle "+getNom());
    }
}
