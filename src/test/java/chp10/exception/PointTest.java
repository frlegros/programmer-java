package chp10.exception;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 24/02/17.
 */
public class PointTest {

    private Point pt, ptErrConst;

    @Before
    public void setUp() throws Exception {

        pt = new Point(2,10);
    }

    @Test
    public void test_casesThrowException(){

        try{
            ptErrConst = new Point(-2,10);
            fail("expected exception was not occured");

        }catch (ErrConst e){
            System.out.println("Pointest ErrConst");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try{
            pt.deplace(-5,5);
            fail("expected exception was not occured");
        }catch (ErrDepl e){
            System.out.println("Pointest ErrDepl");
            System.out.println(e.getMessage());
        }
    }

}