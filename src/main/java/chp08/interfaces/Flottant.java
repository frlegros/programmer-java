package chp08.interfaces;

/**
 * Created by frlegros on 19/02/17.
 */
public class Flottant implements Affichable{

    private Float valeur;

    public Flottant(Float valeur) {
        this.valeur = valeur;
    }

    public void affiche(){
        System.out.println("Je suis suis un flottant de valeur: "+valeur);
    }
}
