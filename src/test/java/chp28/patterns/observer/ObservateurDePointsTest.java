package chp28.patterns.observer;

import chp28.patterns.observer.automatique.ObservateurDePoints;
import chp28.patterns.observer.automatique.Point;
import org.junit.Test;

/**
 * Created by frlegros on 25/03/17.
 */
public class ObservateurDePointsTest {

    @Test
    public void testObservateurDePoint(){

        ObservateurDePoints obs = new ObservateurDePoints();
        Point p1 = new Point("A",3,5);
        Point p2 = new Point("B",2,2);
        p1.deplace(3,9);
        p1.addObserver(obs);
        p1.deplace(2,8);
        p2.deplace(3,2);
        p2.addObserver(obs);
        p2.deplace(1,8);
        p1.deplace(2,2);
        p2.deplace(0,4);
    }

}