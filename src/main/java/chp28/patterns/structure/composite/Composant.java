package chp28.patterns.structure.composite;

/**
 * Created by frlegros on 23/03/17.
 */
abstract class Composant {

    private String nom;

    public String getNom() {
        return nom;
    }

    public Composant(String nom) {
        this.nom = nom;
    }

    public abstract void affiche();
    public void ajoute(Composant c){};

}
