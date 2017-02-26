package chp11.thread;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 26/02/17.
 */
public class EcritTest {



    @Test
    public void test_3threadsAreLaunched() throws Exception{
        Ecrit e1 = new Ecrit("bonjour",10,5);
        Ecrit e2 = new Ecrit("bonsoir",12,10);
        Ecrit e3 = new Ecrit("bonne nuit",5,15);

        e1.start();
        e2.start();
        e3.start();

        Thread.sleep(100);
    }

    private void sleep(int seconds) {

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}