package chp08.extend;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 12/02/17.
 */
public class PointColTest {

    protected PointCol ptCol;
    protected Point pt;
    protected Point [] tabPt;

    @Before
    public void setUp() throws Exception {

        ptCol = new PointCol(5,5,(byte)2);
    }

    @Test
    public void testPolymorphe02_table_heterogene(){
        tabPt =  new Point [4];
        tabPt[0] = new Point(0,2);
        tabPt[1] = new PointCol(1,5,(byte)3);
        tabPt[2] = new PointCol(2,8,(byte)9);
        tabPt[3] = new Point(1,2);

        for (int i=0;i<tabPt.length;i++){

            tabPt[i].affiche();
        }
    }

    @Ignore
    public void testPolymorphe02(){
        // Error à la compil --> Test impossible
        // ptCol =  new HashSetPoint(2,7);
        assertEquals(pt.toString(),"PointCol{couleur=5}");
        pt.affiche();
    }

    @Test
    public void testPolymorphe01(){
        pt =  new PointCol(2,7,(byte)5);
        assertEquals(pt.toString(),"PointCol{couleur=5}");
        pt.affiche();
    }

    @Test
    public void colore() throws Exception {

        ptCol.affiche();
        assertEquals(ptCol.toString(), "PointCol{couleur=2}");
        ptCol.deplace(3, 5);
        assertEquals(ptCol.toString(),"PointCol{couleur=2}");
        ptCol.affiche();

    }

}