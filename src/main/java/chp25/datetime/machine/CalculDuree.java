package chp25.datetime.machine;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by frlegros on 21/03/17.
 */
public class CalculDuree {

    public static void main(String[] args) {
        Instant debut = Instant.now();
        System.out.println("debut = "+debut);
        for (long i=0;i<100_00_00;i++){
            double x = Math.random();
        }
        Instant fin = Instant.now();
        System.out.println("fin = "+fin);

        Duration duree = Duration.between(debut,fin);
        System.out.println("duree = "+duree);

        long duree_ms = duree.toMillis();
        long duree_ns = duree.toNanos();
        System.out.println("duree en ms = "+duree_ms);
        System.out.println("duree en ns = "+duree_ns);
        long nb_nanos = duree.getNano();
        long nb_sec = duree.getSeconds();
        System.out.println("duree en s + ns = "+nb_sec+"s "+nb_nanos+"ns");

    }
}
