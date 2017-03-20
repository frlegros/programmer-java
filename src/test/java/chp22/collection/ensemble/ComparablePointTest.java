package chp22.collection.ensemble;

import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by frlegros on 15/03/17.
 */
public class ComparablePointTest {

    @Test
    public void test_should_search_max_or_min() throws Exception {

        ComparablePoint p1 = new ComparablePoint(1,3);
        ComparablePoint p2 = new ComparablePoint(2,1);
        ComparablePoint p3 = new ComparablePoint(5,2);
        ComparablePoint p4 = new ComparablePoint(3,2);

        LinkedList<ComparablePoint> l = new LinkedList<ComparablePoint>();
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);

        System.out.println("l= "+l);

        ComparablePoint pMax1 = Collections.max(l);
        System.out.println("pMax1 = "+pMax1);

        ComparablePoint pMax2 = (ComparablePoint)Collections.max(l, new Comparator<ComparablePoint>() {
            @Override
            public int compare(ComparablePoint o1, ComparablePoint o2) {
                if (o1.y<o2.y) return -1;
                else if (o1.y==o2.y) return 0;
                else return 1;
            }
        });
        System.out.println("pMax2 = "+pMax2);
    }

}