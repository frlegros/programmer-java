package chap21.methode.generique;

import org.junit.Test;

import static chap21.methode.generique.MethGen1.hasard;
import static org.junit.Assert.*;

/**
 * Created by frlegros on 08/03/17.
 */
public class MethGen1Test {
    @Test
    public void testhasard() throws Exception {

        Integer[] tabi = {1, 5, 8, 4, 9};
        System.out.println("hasard sur tabi= " + hasard(tabi));

        String[] tabs = {"bonjour", "salut", "hello"};
        System.out.println("hasard sur tabs= "+ hasard(tabs));
    }

}