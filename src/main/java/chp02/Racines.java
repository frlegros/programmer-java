package chp02;

import utils.Clavier;

/**
 * Created by frlegros on 09/10/16.
 */
public class Racines {

    public static void main(String[] args) {
        final int NFOIS = 5;
        int i;
        double x;
        double racx;

        System.out.println("Bonjour");
        System.out.println("Je vais vous calculer " + NFOIS + " racines carrées");

        for (i = 0; i < NFOIS; i++) {
            System.out.println("Donnez un nombre : ");
            x = Clavier.lireDouble();
            if (x < 0.0)
                System.out.println(x + " ne possède pas de racine carrée");
            else {
                racx = Math.sqrt(x);
                System.out.println(x + " a pour racine carrée: " + racx);
            }
        }
        System.out.println("Travail terminé - Au revoir");
    }
}
