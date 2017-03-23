package chp28.patterns.structure.adapteur;

import chp28.patterns.structure.adapteur.classe.PointXAdapteC;
import chp28.patterns.structure.adapteur.objet.PointXAdapteO;
import org.junit.Test;

/**
 * Created by frlegros on 23/03/17.
 */
public class PointXTest {
    @Test
    public void montre() throws Exception {

        System.out.println("--- Cas sans adapteur");
        PointX px = new PointX(3,5);
        px.montre();
        px.deltaX(3);
        px.deltaX(5);
        px.montre();

        System.out.println("--- Cas avec adapteur Objet");
        PointXAdapteO pxao = new PointXAdapteO(px);
        pxao.affiche();
        pxao.deplace(3,5);
        pxao.affiche();

        System.out.println("--- Cas avec adapteur Classe");
        PointXAdapteC pxac = new PointXAdapteC(px);
        pxac.affiche();
        pxac.deplace(3,5);
        pxac.affiche();

    }

}