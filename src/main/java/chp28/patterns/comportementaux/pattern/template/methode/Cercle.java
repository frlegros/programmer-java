package chp28.patterns.comportementaux.pattern.template.methode;

/**
 * Created by frlegros on 01/03/17.
 */
public class Cercle extends Forme{

    private double r;

    public static int compteur=0;

    public Cercle(int x, int y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        compteur++;
    }

    public void afficheNature(){
        System.out.println("Je suis un Cercle");
    }

    @Override
    public void afficheAutresInfos(){
        System.out.println("-- Rayon = "+r);
    }
}
