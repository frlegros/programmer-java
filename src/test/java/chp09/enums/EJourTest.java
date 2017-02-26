package chp09.enums;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 24/02/17.
 */
public class EJourTest {


    @Test
    public void affiche() throws Exception {

        System.out.println("Noms des valeurs du type jour");

        for (EJour j : EJour.values()) {
            System.out.println(j + " : " + j.abreviation());
        }
    }

}