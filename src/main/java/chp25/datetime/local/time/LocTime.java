package chp25.datetime.local.time;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Created by frlegros on 21/03/17.
 */
public class LocTime {

    public static void main(String[] args) {
        LocalTime maintenant = LocalTime.now();
        System.out.println("Il est = "+maintenant);

        LocalTime dansTroisHeures =maintenant.plusHours(3);
        System.out.println("Dans 3 heures = "+dansTroisHeures);

        Duration ecart = Duration.between(dansTroisHeures,maintenant);
        System.out.println("Différence entre ces deux heures: "+ecart.toHours());
    }
}
