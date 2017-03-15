package chap21.classe.generique.notion;

import chp10.exception.Point;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 06/03/17.
 */
public class CoupleDiffTest {
    @Test
    public void affiche() throws Exception {

        Integer oi1 = 3;
        Point op1 = new Point(10,50);

        CoupleDiff<Integer,Point> cd1 = new CoupleDiff<Integer, Point>(oi1,op1);
        cd1.affiche();
    }

}