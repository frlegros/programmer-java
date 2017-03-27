package chp28.patterns.comportementaux.pattern.template.methode;

/**
 * Created by frlegros on 01/03/17.
 */
public class Point extends Forme{

    public static int compteur=0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        compteur++;
    }

    public void afficheNature(){
        System.out.println("Je suis un Point");
    }

}
