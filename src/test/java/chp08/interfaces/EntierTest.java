package chp08.interfaces;


import org.junit.Test;

/**
 * Created by frlegros on 19/02/17.
 */
public class EntierTest {

    private Affichable objTst;

    @Test
    public void affiche() throws Exception {


        objTst = new Entier(12);
        objTst.affiche();

        objTst = new Flottant(1.25f);
        objTst.affiche();

    }

}