package chp08.abstrait;

/**
 * Created by frlegros on 19/02/17.
 */
public class Flottant extends Affichable{

    private Float valeur;

    public Flottant(Float valeur) {
        this.valeur = valeur;
    }

    public void affiche(){
        System.out.println("Je suis suis un flottant de valeur: "+valeur);
    }
}
