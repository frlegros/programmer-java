package chp08.extend;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 10/02/17.
 */
public class PointTest {
    protected Point pt;

    @Before
    public void setUp() {
        pt = new Point(10,5);
    }

    @Test
    public void testPoint() {

        pt.deplace(5,5);
        assertEquals(pt.toString(),"HashSetPoint{x=15, y=10}");
        pt.deplace(3,5);
        assertEquals(pt.toString(),"HashSetPoint{x=18, y=15}");

    }
}