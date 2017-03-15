package chap21.classe.generique.notion;

import chp10.exception.Point;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by frlegros on 06/03/17.
 */
public class CoupleIdentTest {


    @Test
    public void affiche() throws Exception {

        CoupleIdent<Integer> ci;
        CoupleIdent<Point> cp;

        Integer oi1 = 15;
        Integer oi2 = 20;
        ci = new CoupleIdent<Integer>(oi1,oi2);
        ci.affiche();


        Point cp1 = new Point(5, 10);
        Point cp2 = new Point(10, 100);
        cp = new CoupleIdent<Point>(cp1,cp2);
        cp.affiche();
    }

}