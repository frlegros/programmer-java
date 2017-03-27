package chp28.patterns.strategie.pattern;

import chp28.patterns.comportementaux.pattern.strategie.*;
import org.junit.Test;

/**
 * Created by frlegros on 24/03/17.
 */
public class PointTest {
    @Test
    public void affiche() throws Exception {

        ModeAffichage maCourt = new AffichageCourt();
        Point p1 = new Point(2,9,maCourt);
        p1.affiche();

        ModeAffichage maLong = new AffichageLong();
        Point p2 = new Point(4,7,maLong);
        p2.affiche();
    }

}