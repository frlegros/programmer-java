package chp11.thread;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 26/02/17.
 */
public class EcritRunTest {

    @Test
    public void testRun3Threads() throws Exception {

        EcritRun e1 = new EcritRun("bonjour",10,5);
        EcritRun e2 = new EcritRun("bonsoir",12,10);
        EcritRun e3 = new EcritRun("bonne nuit",5,15);

        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(100);

    }
}