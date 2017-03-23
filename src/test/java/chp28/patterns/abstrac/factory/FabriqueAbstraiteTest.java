package chp28.patterns.abstrac.factory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 23/03/17.
 */
public class FabriqueAbstraiteTest {

    @Test
    public void testFabriqueAbstraite() throws Exception {

        BoutonRadio br1, br2;
        CaseCocher cc;

        FabriqueAbstraite f = new FabriqueStyleA();
        br1 = f.creerBoutonRadio();
        System.out.println(br1.type());
        cc = f.creerCaseCocher();
        System.out.println(cc.identification());

        f = new FabriqueStyleB();
        br2 = f.creerBoutonRadio();
        System.out.println(br2.type());
    }

}