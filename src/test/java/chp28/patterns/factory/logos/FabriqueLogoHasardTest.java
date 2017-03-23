package chp28.patterns.factory.logos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 23/03/17.
 */
public class FabriqueLogoHasardTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testFabriqueLogoHasard() throws Exception {

        FabriqueLogo fab = new FabriqueLogoHasard();
        System.out.println("-- Avec Fabrique au Hasard");
        for (int i=0;i<4;i++){
            Logo l = fab.getLogo();
            l.affiche();
        }
    }

    @Test
    public void testFabriqueLogoAlterne() throws Exception {

        FabriqueLogo fab = new FabriqueLogoAlternes();
        System.out.println("-- Avec Fabrique alterné");
        for (int i=0;i<4;i++){
            Logo l = fab.getLogo();
            l.affiche();
        }
    }

}