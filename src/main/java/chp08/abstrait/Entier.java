package chp08.abstrait;

/**
 * Created by frlegros on 19/02/17.
 */
public class Entier extends Affichable {

    private int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    public void affiche() {
        System.out.println("Je suis un entier de valeur: " + valeur);
    }
}
