package chp28.patterns.comportementaux.pattern.strategie;

/**
 * Created by frlegros on 24/03/17.
 */
public class AffichageLong extends ModeAffichage{

    public void presente(int x, int y){
        System.out.println("abscisse= "+x+", ordonnée= "+y);
    };
}
