package chp08.interfaces;


/**
 * Created by frlegros on 19/02/17.
 */
public class Entier implements Affichable {

    private int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    public void affiche() {
        System.out.println("Je suis un entier de valeur: " + valeur);
    }
}
