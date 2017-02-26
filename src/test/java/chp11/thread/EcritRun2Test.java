package chp11.thread;

import org.junit.Test;

/**
 * Created by frlegros on 26/02/17.
 */
public class EcritRun2Test {

    @Test
    public void testRun3Threads() throws Exception {

        EcritRun2 e1 = new EcritRun2("bonjour",10,5);
        EcritRun2 e2 = new EcritRun2("bonsoir",12,10);
        EcritRun2 e3 = new EcritRun2("bonne nuit",5,15);

        e1.start();
        e2.start();
        e3.start();

        Thread.sleep(100);

    }
}