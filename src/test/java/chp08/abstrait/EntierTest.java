package chp08.abstrait;

import chp08.extend.PointCol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 19/02/17.
 */
public class EntierTest {

    private Affichable objTst;


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void affiche() throws Exception {

        objTst = new Entier(12);
        objTst.affiche();

        objTst = new Flottant(1.25f);
        objTst.affiche();
    }

}