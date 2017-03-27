package chp28.patterns.comportementaux.pattern.template.methode;

import org.junit.Test;


/**
 * Created by frlegros on 24/03/17.
 */
public class PointTest {

    @Test
    public void testpatternTemplateMethod() throws Exception {

        Point p1 = new Point(5, 7);
        p1.affiche();

        Cercle c1 = new Cercle(2,10,4.5);
        c1.affiche();
    }
}