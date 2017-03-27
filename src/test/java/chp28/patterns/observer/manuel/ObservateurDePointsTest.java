package chp28.patterns.observer.manuel;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 27/03/17.
 */
public class ObservateurDePointsTest {

    @Test
    public void testObservateurDePoints() throws Exception {

        ObservateurDePoints of = new ObservateurDePoints();
        Point p1 = new Point("A",3,5);
        Point p2 = new Point("B",3,5);
        p1.deplace(3,9);
        p1.saveObserver(of);
        p1.deplace(2,8);
        p2.deplace(3,2);
        p2.saveObserver(of);
        p1.deplace(1,8);
        p2.deplace(2,2);
    }

}