package chp28.patterns.decorateur;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 23/03/17.
 */
public class PointTest {
    @Test
    public void testAffiche() throws Exception {

        Affichable pc = new ColorationDeco(new Point(6,5),"rouge");
        pc.affiche();

        Affichable pf = new FormeDeco(new Point(1,4),'*');
        pf.affiche();

        Affichable pcf = new FormeDeco(pc, '+');
        pcf.affiche();

    }

}