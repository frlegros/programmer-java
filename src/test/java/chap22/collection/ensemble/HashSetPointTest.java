package chap22.collection.ensemble;

import chap22.collection.ensemble.HashSetPoint;
import org.junit.Test;

import java.util.HashSet;

/**
 * Created by frlegros on 14/03/17.
 */
public class HashSetPointTest {

    private HashSetPoint p1 = new HashSetPoint(1, 3);
    private HashSetPoint p2 = new HashSetPoint(2, 2);
    private HashSetPoint p3 = new HashSetPoint(4, 5);
    private HashSetPoint p4 = new HashSetPoint(1, 8);

    private HashSetPoint p[] = {p1, p2, p1, p3, p4, p3};

    @Test
    public void test_when_hashset_then_HashCode() throws Exception {

        HashSet<HashSetPoint> ens = new HashSet<HashSetPoint>();

        for (HashSetPoint px : p) {
            System.out.print("Le point: " + px);
            boolean ajoute = ens.add(px);
            System.out.println((ajoute) ? " a été ajouté" : " est déjà présent");
        }
        System.out.println("Ensemble = " + ens);
    }



}