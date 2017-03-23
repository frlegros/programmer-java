package chp28.patterns.decorateur;

/**
 * Created by frlegros on 23/03/17.
 */
public class ColorationDeco extends Affichable{

    private Affichable p;

    private String c;

    public ColorationDeco(Affichable p, String c) {
        this.p = p;
        this.c = c;
    }

    public void affiche(){
        p.affiche();
        System.out.println(" couleur: "+c);
    }

}
