package chp28.patterns.comportementaux.pattern.template.methode;

/**
 * Created by frlegros on 24/03/17.
 */
public abstract class Forme {

    protected int x, y;

    public void affiche(){
        afficheNature();
        System.out.println("-- Coordonnées = "+ x+" "+y);
        afficheAutresInfos();
    }

    abstract public void afficheNature();

    public void afficheAutresInfos(){}
}
