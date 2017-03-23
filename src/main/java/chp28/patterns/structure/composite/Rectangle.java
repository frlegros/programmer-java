package chp28.patterns.structure.composite;

/**
 * Created by frlegros on 23/03/17.
 */
public class Rectangle extends Composant{

    public Rectangle(String nom) {
        super(nom);
    }

    public void affiche(){
        System.out.println("Rectangle "+getNom());
    }
}
