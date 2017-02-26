package chp11.thread;

import org.junit.Test;
import utils.Clavier;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 26/02/17.
 */
public class NombresTest {

    @Test
    public void tstSynchronizeThreads_wichAccess_toTheSameObject() throws Exception {

        Nombres nombres = new Nombres();
        Thread calc = new ThrNombresCalc(nombres);
        Thread aff = new ThrNombresAff(nombres);
        System.out.println("Suite de carrés");
        calc.start();;aff.start();
        Thread.sleep(2000);
        calc.interrupt();aff.interrupt();
    }
}