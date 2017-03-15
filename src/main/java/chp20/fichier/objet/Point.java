package chp20.fichier.objet;

import java.io.Serializable;

/**
 * Created by frlegros on 01/03/17.
 */
public class Point implements Serializable{

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affiche(){
        System.out.println("Coordonnées= "+x+" "+y);
    }
}
