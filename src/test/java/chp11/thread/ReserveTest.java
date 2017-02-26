package chp11.thread;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 26/02/17.
 */
public class ReserveTest {


    @Test
    public void test_puiseDansStockSansDepasserLaReserve() throws Exception {

        Reserve r = new Reserve();

        ThrReserveAjout ta1 = new ThrReserveAjout(r,100,15);
        ThrReserveAjout ta2 = new ThrReserveAjout(r,50,20);

        ThrReservePuise tp = new ThrReservePuise(r,300,10);

        System.out.println("Suivi de Stock");

        ta1.start();
        ta2.start();
        tp.start();
        Thread.sleep(2000);
    }

}