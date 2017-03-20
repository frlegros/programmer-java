package chp22.collection.ensemble;

import org.junit.Test;

import java.util.TreeSet;

/**
 * Created by frlegros on 14/03/17.
 */
public class TreeSetPointTest {

    private TreeSetPoint p1 = new TreeSetPoint(1, 3);
    private TreeSetPoint p2 = new TreeSetPoint(2, 2);
    private TreeSetPoint p3 = new TreeSetPoint(4, 5);
    private TreeSetPoint p4 = new TreeSetPoint(1, 8);

    private TreeSetPoint p[] = {p1, p2, p1, p3, p4, p3};

    @Test
    public void test_when_treeSet_then_compareTo() throws Exception {

        TreeSet<TreeSetPoint> ens = new TreeSet<TreeSetPoint>();

        for (TreeSetPoint px : p) {
            System.out.print("Le point: " + px);
            boolean ajoute = ens.add(px);
            System.out.println((ajoute) ? " a été ajouté" : " est déjà présent");
        }
        System.out.println("Ensemble = " + ens);
    }

}