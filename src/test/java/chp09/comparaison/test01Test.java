package chp09.comparaison;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 21/02/17.
 */
public class test01Test {

    private Test01 test01;

    @Before
    public void setUp() throws Exception {

        test01 = new Test01();
    }

    @Test
    public void areStringsIdentical() throws Exception {

        test01.areStringsIdentical();
    }

}