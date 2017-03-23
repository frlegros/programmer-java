package chp28.patterns.structure.composite;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 23/03/17.
 */
public class ComposantTest {
    @Test
    public void affiche() throws Exception {

        Cercle c1 = new Cercle("C1");
        c1.affiche();
        Cercle c2 = new Cercle("C2");
        c2.affiche();
        Rectangle r1 = new Rectangle("R1");
        r1.affiche();
        Groupe ga = new Groupe("GA");
        ga.ajoute(c1);
        ga.ajoute(r1);
        ga.affiche();
        Groupe gb = new Groupe("GB");
        gb.ajoute(ga);
        gb.ajoute(c2);
        gb.affiche();
    }

}