package chp11.thread;

import org.junit.Test;
import utils.Clavier;

import java.util.concurrent.TimeUnit;

/**
 * Created by frlegros on 26/02/17.
 */
public class EcritInterruptedTest {



    @Test
    public void test_3threadsAreLaunched() throws Exception{
        EcritInterrupted e1 = new EcritInterrupted("bonjour",5);
        EcritInterrupted e2 = new EcritInterrupted("bonsoir",10);
        EcritInterrupted e3 = new EcritInterrupted("bonne nuit",35);

        e1.start();
        e2.start();
        e3.start();

        Thread.sleep(2000);
        e1.interrupt();
        System.out.println("Arrêt 1er thread");
        Thread.sleep(2000);
        e2.interrupt();
        e3.interrupt();
        System.out.println("Arrêt deux derniers thread");

    }

    private void sleep(int seconds) {

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}