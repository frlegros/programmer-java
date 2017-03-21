package chp25.datetime.machine;

import java.time.Instant;

/**
 * Created by frlegros on 21/03/17.
 */
public class BoucleDuree {

    public static void main(String[] args) {

        final int DUREE_BOUCLE_MS = 2500;

        Instant maintenant = Instant.now();
        System.out.println("Demarre à : "+maintenant);
        Instant fin = maintenant.plusMillis(DUREE_BOUCLE_MS);
        do {
            maintenant = Instant.now();
        }
        while (fin.isAfter(maintenant));
        System.out.println("Fini à : "+maintenant);
    }
}
